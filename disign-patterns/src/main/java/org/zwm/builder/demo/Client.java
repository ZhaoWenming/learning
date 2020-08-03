package org.zwm.builder.demo;

public class Client {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥具体的工人去完成产品
        Product build = director.build(new Worker());
    }
}