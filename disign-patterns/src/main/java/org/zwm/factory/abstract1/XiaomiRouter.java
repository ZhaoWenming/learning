package org.zwm.factory.abstract1;

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器启动");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关闭");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
