package org.zwm.proxy.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 我们会用这个类，自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    //set方式注入
    public void setTarget(Object target) {
        this.target = target;
    }

    //生成动态代理
    public Object getProxy(){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return proxy;
    }

    //处理代理实例，并返回结果,在invoke中执行真正执行的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }

}
