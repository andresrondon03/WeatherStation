package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class WeatherData {

    // Se agregan las variables deñ programa
    List<Observer> observers;
    float temperature=0;
    float humidity=0;
    float pressure=0;

    // Se agregan los métodos para el/los Obsever
    public WeatherData (){
        observers = new ArrayList<>();
    }

    public void registerObserver (Observer o){
        observers.add(o);
    }

    public void removeObserver (Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer o: observers){
            o.update(temperature, humidity, pressure);
        }
    }
    
    public void setMeasurements (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
