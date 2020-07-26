package org.zwm.demo03;

public class Client {
        public static void main(String[] args) {
            //真实角色
            Host host = new Host();
            //代理角色：现在没有
            ProxyInvocationHandler pih = new ProxyInvocationHandler();
            pih.setTarget(host);
            //生成动态代理实例
            Rent proxy = (Rent) pih.getProxy();
            proxy.rent();
        }
    }
