package org.zwm.factory.abstract1;

//小米手机
public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("用小米手机发信息");
    }
}
