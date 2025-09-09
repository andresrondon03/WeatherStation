package observer;

import subject.WeatherData;

public class Pressure implements Observer, DisplayElement{
    float pressure=0;

    public Pressure(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.pressure = pressure;
        display(); 
    }
    
    // Se imprime la informacion por pantalla
    public void display(){
        System.out.println("Presion atmoférica:");
        System.out.println("\tHoy tenemos una presión de: " + pressure + "mmHg");
        System.out.println();
    }
}
