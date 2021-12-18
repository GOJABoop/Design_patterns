package abstract_factory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String veggies[];
    String cheese;
    String pepperoni;
    String clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in ofﬁcial PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        String veggiesStr = "";
        for(int i = 0; i < veggies.length; i++){
            veggiesStr += veggies[i];
            veggiesStr += ", ";
        }
        return name + "with: " + dough + ", " + sauce + ", " + cheese + ",\n\t" + pepperoni
                    + " " + clam + ", " + veggiesStr;
    }
}
