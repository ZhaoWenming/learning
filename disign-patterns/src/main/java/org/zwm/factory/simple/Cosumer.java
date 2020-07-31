package org.zwm.factory.simple;

public class Cosumer {
    public static void main(String[] args) {
        //1.普通方法创建
//        Car car = new WuLing();
//        Car car2 = new Tesla();

        //2.使用工厂类创建
        Car car = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");

        car.name();
        car2.name();
    }
}
