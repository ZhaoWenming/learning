package org.zwm.builder.demo;

//具体的建造者：工人
public class Worker extends Builder {

    private Product product;

    //构造器
    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基建造完毕");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋水泥");
        System.out.println("钢筋水泥建造完毕");
    }

    @Override
    void buildC() {
        product.setBuildC("电线");
        System.out.println("电线铺设完毕");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷完毕");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
