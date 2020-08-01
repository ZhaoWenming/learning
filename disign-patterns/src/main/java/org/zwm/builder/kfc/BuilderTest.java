package org.zwm.builder.kfc;

public class BuilderTest {
    public static void main(String[] args) {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1("大汉堡", "小薯条");
        KFC kfc = new Director().build(concreteBuilder1);
        System.out.println(kfc);
    }
}
