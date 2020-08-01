package org.zwm.builder.kfc2;

public class Test {
    public static void main(String[] args) {
        KFC kfc = new KFC.Builder("汉堡", "薯条").setChicken("炸鸡").getKFC();
        System.out.println(kfc);
    }
}
