package org.zwm.builder.demo;

//抽象的建造者：方法
public abstract class Builder {
    abstract void buildA();  //地基
    abstract void buildB();  //钢筋水泥
    abstract void buildC();  //铺电线
    abstract void buildD();  //粉刷

    //完工：得到产品
    abstract Product getProduct();
}
