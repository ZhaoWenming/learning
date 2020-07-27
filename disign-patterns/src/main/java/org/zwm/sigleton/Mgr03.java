package org.zwm.sigleton;

/**
 * lazy loading
 * 懒汉式，什么时候用的时候什么时候初始化
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Mgr03 {

    private static Mgr03 INSTANCE;

    private Mgr03(){

    }

    //调用getInstance的时候才初始化，理想的情况是只有第一次调用的时候才进行初始化，以后的调用就不进行初始化了
    public static Mgr03 getInstance(){
        if (INSTANCE == null){
            //加入sleep模拟多线程的情况，来验证懒汉式的线程不安全的情况
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
