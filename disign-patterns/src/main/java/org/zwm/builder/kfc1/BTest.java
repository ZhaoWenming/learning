package org.zwm.builder.kfc1;

public class BTest {
    public static void main(String[] args) {
        KFC kfc = new ConcreteBuilder("汉堡", "薯条").setChicken().setCola().setPizza().getKFC();
        System.out.println(kfc);
    }
}
