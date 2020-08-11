package org.zwm.observer;

/**
 * 接口，让WeatherData来实现
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
