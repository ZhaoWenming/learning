package org.zwm.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("小米系列产品=======================");
        IProductFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct iPhoneProduct = xiaomiFactory.iphoneProduct();
        iPhoneProduct.callup();
        iPhoneProduct.sendMessage();

        System.out.println("华为系列产品=======================");
        IProductFactory huaweiFactory = new HuaweiFactory();
        IPhoneProduct iPhoneProduct1 = huaweiFactory.iphoneProduct();
        iPhoneProduct1.callup();
        iPhoneProduct1.sendMessage();
    }
}
