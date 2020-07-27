package org.zwm.sigleton;

/**
 * 跟01是一个意思
 */
public class Mgr02 {

    //定义了final的变量需要马上进行初始化，如果不初始化，需要马上跟上static的代码块进行初始化
    private static final Mgr02 INSTANCE;

    //静态代码块初始化
    static {
        INSTANCE = new Mgr02();
    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);
    }
}
