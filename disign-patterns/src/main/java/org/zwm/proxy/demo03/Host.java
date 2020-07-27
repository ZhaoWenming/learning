package org.zwm.proxy.demo03;

/**
 * 房东，实现租房子接口，被代理的对象
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
