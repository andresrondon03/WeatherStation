import observer.CurrentConditions;
import observer.Forecast;
import observer.HeatIndex;
import observer.Pressure;
import observer.Statistics;
import subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditions(weatherData);
        new Statistics(weatherData);
        new Forecast(weatherData);
        new Pressure(weatherData);
        new HeatIndex(weatherData);

        weatherData.setMeasurements(13, 88, 555);
        weatherData.setMeasurements(20, 64, 579);
        weatherData.setMeasurements(17, 76, 567);
    }
}
