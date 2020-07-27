package org.zwm.sigleton;

/**
 * lazy loading
 * 懒汉式，什么时候用的时候什么时候初始化
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 *
 * 可以通过synchronized方法解决，但也带来了效率下降
 */
public class Mgr05 {

    private static volatile Mgr05 INSTANCE;

    private Mgr05(){

    }

    //调用getInstance的时候才初始化，理想的情况是只有第一次调用的时候才进行初始化，以后的调用就不进行初始化了
    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            //加锁，同时进行双重检查
            synchronized (Mgr05.class){
                if (INSTANCE == null){
                    try {
                        //加入sleep模拟多线程的情况，来验证懒汉式的线程不安全的情况
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
