package observer;

import subject.WeatherData;

public class Statistics implements Observer, DisplayElement{
    float maxTemp=0;
    float minTemp=999;
    float tempSum=0;
    int lecturas=0;
    float prom=0;
    
    public Statistics(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        tempSum += temperature;
        lecturas ++;
        // Se agregan condiciones para que las variables tomen los valores correspondientes
        if (temperature > maxTemp) maxTemp = temperature;
        if (temperature < minTemp) minTemp = temperature;

        // Se calcula el promedio de la temperatura
        prom=(tempSum/lecturas);
        display();
    }
    
    // Se imprime la informacion por pantalla
    public void display(){
        System.out.println("Estadisticas de la temperatura:");
        System.out.println("\tTemperatura máxima registrada: " + maxTemp + "°C");
        System.out.println("\tTemperatura mínima registrada: " + minTemp + "°C");
        System.out.println("\tTemperatura promedio: " + prom + "°C");
        System.out.println();
    }
}
