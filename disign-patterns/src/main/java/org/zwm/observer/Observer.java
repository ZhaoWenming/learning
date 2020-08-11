package org.zwm.observer;

/**
 * 观察者接口，由观察者来实现
 */
public interface Observer {
    /**
     * 更新数据
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    void update(float temperature, float pressure, float humidity);

}
