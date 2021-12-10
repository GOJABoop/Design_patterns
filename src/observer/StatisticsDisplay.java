package observer;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    //here is list for measurements tu calculate statics

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("min/avg/max temperature: 80 (example)");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
