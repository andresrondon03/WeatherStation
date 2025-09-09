package observer;

import subject.WeatherData;

public class HeatIndex implements Observer, DisplayElement{
    double c1=-8.78469475556;
    double c2=1.61139411;
    double c3=2.33854883889;
    double c4=-0.14611605;
    double c5=-0.012308094;
    double c6=-0.016428277778;
    double c7=2.211732e-3;
    double c8=7.2546e-4;
    double c9=-3.582e-6;
    double heatIndex=0;

    public HeatIndex(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        heatIndex = calculeHeatIndex(temperature, humidity);
        display(); 
    }

    float calculeHeatIndex(float t, float h){
        heatIndex=c1+(c2*t)+(c3*h)+(c4*t*h)+(c5*(Math.pow(t, 2)))+(c6*Math.pow(h, 2))+(c7*Math.pow(t, 2)*h)+(c8*t*Math.pow(h, 2))+(c9*Math.pow(t, 2)*Math.pow(h, 2));
        return h;
    }
    
    public void display(){
        System.out.println("Índice de calor");
        System.out.println("\tEl índice para el día de hoy es: " + heatIndex + "°C");
        System.out.println();
    }
}