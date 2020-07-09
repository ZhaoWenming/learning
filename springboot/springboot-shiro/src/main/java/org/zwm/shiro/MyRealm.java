package org.zwm.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

import java.util.Objects;

public class MyRealm implements Realm {
    @Override
    public String getName() {
        return "myrealm";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        //仅支持UsernamePasswordToken类型的token
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //得到用户名
        String userName = (String) token.getPrincipal();
        //得到密码
        String password = String.valueOf((char[]) token.getCredentials());

        if (!Objects.equals("zhang", userName)){
            throw new UnknownAccountException();
        }
        if (!Objects.equals("123", password)){
            throw new IncorrectCredentialsException();
        }

        //如果身份验证成功，返回一个AuthenticationInfos实现
        return new SimpleAuthenticationInfo(userName, password, getName());
    }
}
