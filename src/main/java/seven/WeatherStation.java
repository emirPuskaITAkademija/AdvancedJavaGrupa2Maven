package seven;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
