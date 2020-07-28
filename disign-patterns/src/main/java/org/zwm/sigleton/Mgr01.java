package org.zwm.sigleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用到与否，类装载时完成实例化
 */
public class Mgr01 {

    //私有构造器,其它类new不了
    private Mgr01() {

    }

    //此处调用的是无参构造函数，静态参数在类初始化的时候加载
    private static final Mgr01 INSTANCE = new Mgr01();

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
