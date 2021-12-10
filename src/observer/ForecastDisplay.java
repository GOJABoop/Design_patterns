package observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("it sure will rain");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
