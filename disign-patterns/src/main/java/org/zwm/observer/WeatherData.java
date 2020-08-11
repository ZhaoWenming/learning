package org.zwm.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * 类的核心
 * 1.包含最新的天气情况信息
 * 2.含有观察者集合，使用ArrayList管理
 * 3.当数据更新时，就主动调用ArrayList,通知所有的接入方去看到最新的消息
 */

@Getter
@Setter
public class WeatherData implements Subject{
    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    //当数据有更新时，就调用setDate
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange方法，将最新的信息推送给接入方
        dataChange();
    }

    public void dataChange(){
        //调用obsever的数据
        notifyObserver();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (!observers.contains(o)) {
            return;
        }
        observers.remove(o);
    }

    //遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, pressure, humidity);
        }
    }
}
