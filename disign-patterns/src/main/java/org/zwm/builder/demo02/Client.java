package org.zwm.builder.demo02;

public class Client {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        //链式编程
        Product product = worker
                .buildA("咖啡")
                .buildB("甜筒")
                .buildC("全家桶")
                .getProduct();
        System.out.println(product.toString());
    }
}
