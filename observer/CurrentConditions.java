package observer;

import subject.WeatherData;

public class CurrentConditions implements Observer, DisplayElement {
    float temperature=0;
    float humidity=0;
    float pressure=0;

    public CurrentConditions(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display(); 
    }

    // Se imprime la informacion por pantalla
    public void display(){
        System.out.println();
        System.out.println("A continuacion, la información climatica del día");
        System.out.println();
        System.out.println("Las condiciones climaticas actuales son:");
        System.out.println("\tTemperatura: " + temperature + "°C");
        System.out.println("\tHumedad: " + humidity + "%");
        System.out.println();
    }
}
