package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() { // fill the boiler with a milk/chocolate mixture
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling Boiler");
        }
    }

    public void drain() { // drain the boiled milk and chocolate
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining Boiler");
        }
    }

    public void boil() { // bring the contents to a boil
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling Boiler");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
