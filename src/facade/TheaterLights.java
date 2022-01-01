package facade;

public class TheaterLights {
    public TheaterLights() { }

    public void on() {
        System.out.println("Theater lights are set on");
    }

    public void off() {
        System.out.println("Theater lights are set off");
    }

    public void dim(int level) {
        System.out.println("Theater lights are set to dim to: " + level);
    }
}
