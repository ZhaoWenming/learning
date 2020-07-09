package org.zwm.shiro;


import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.env.BasicIniEnvironment;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 身份验证功能测试
 */
@SpringBootTest
@Slf4j
public class AuthenticationTest {

    /**
     * 身份验证的步骤：
     * 1. 收集用户身份/凭证，即如用户名/密码
     * 2. 调用Subject.login进行登录，如失败将得到相应的AuthenticationException异常，否则登录成功
     * 3. 最后调用Subject.logout进行退出
     * -----------------------------------------------------------------------------------------------
     * 以下测试中的几个问题：
     * 1. 用户名/密码硬编码在ini配置文件，以后需要改成如数据库存储，且密码需要加密存储
     * 2. 用户身份Token可能不仅仅是用户名/密码，也可能包含其它信息，如登录时允许用户名/邮箱/手机号同时登录
     */
    @Test
    public void test(){

        //读入环境数据
        BasicIniEnvironment basicIniEnvironment = new BasicIniEnvironment("classpath:shiro/realm.ini");

        //获取securityManager
        SecurityManager securityManager = basicIniEnvironment.getSecurityManager();

        //将securityManager绑定到SecurityUtil
        SecurityUtils.setSecurityManager(securityManager);

        //得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhang", "123");

        try {
            subject.login(usernamePasswordToken);
            log.info("身份验证成功");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            log.error("身份验证失败");
        }
        subject.logout();

    }

}
