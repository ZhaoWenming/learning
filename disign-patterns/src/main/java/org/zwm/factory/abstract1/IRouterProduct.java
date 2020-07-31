package org.zwm.factory.abstract1;


//路由器产品接口
public interface IRouterProduct {

    //开机
    void start();
    //关机
    void shutdown();
    //设置wifi
    void openWifi();
    //设置参数
    void setting();
}
