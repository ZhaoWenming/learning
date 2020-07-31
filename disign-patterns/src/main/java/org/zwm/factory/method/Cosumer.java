package org.zwm.factory.method;

public class Cosumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new MoBaiFactory().getCar();
        car.name();
        car1.name();
        car2.name();
    }
}
