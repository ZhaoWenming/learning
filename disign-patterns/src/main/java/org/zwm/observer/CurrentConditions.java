package org.zwm.observer;

public class CurrentConditions implements Observer {
    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，我们使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    
    //显示
    public void display(){
        System.out.println("今天的温度是："+ this.temperature);
        System.out.println("今天的气压是："+ this.pressure);
        System.out.println("今天的湿度是："+ this.humidity);
    }
}
