package observer_pattern;

public class WeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        weatherStation.setWeatherData(30, 65, 1013.1f);
        weatherStation.setWeatherData(28, 70, 1012.5f);
        weatherStation.setWeatherData(26, 90, 1011.3f);
    }
}

