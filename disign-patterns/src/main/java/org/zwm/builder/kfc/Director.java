package org.zwm.builder.kfc;

public class Director {
    public KFC build(Builder builder){
        builder.setChicken();
        builder.setCola();
        return builder.getKFC();
    }
}
