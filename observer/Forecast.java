package observer;

import subject.WeatherData;

public class Forecast implements Observer, DisplayElement{
    float lastPressure=0;
    float currentPressure=760; //Presion promedio 

    public Forecast(WeatherData weatherData){
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure){
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
    
    public void display(){
        System.out.println("Pronostico del dia");
        // Se agregan condiciones para que imprima el mensaje correcto en pantalla
        if (currentPressure > lastPressure){
            System.out.println("\t¡¡Esta mejorando el clima, posibilidades de sol!");
        } else if (currentPressure == lastPressure){
            System.out.println("\t¡El clima no cambio nada en estos días!");
        } else {
            System.out.println("\t¡¡Esta empeorando el clima, posibilidades de lluvia!!");
        }
        System.out.println();
    }
}
