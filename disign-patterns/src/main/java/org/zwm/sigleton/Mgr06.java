package org.zwm.sigleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr06 {

    private Mgr06(){

    }

    //静态内部类,在加载Mgr06的时候，Mgr06Holder是不会被初始化的
    private static class Mgr06Holder {
        private final static Mgr06 INSTANCE = new Mgr06();
    }

    public static Mgr06 getInstance(){
        return Mgr06Holder.INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
