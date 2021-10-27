public class WeatherStation {
    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30, 40, 60.4f);
        weatherData.setMeasurements(40, 50, 70.4f);
    }
}
