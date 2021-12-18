package abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public String createDough() {
        return "Thin Crust Dough";
    }

    public String createSauce() {
        return "Marinara Sauce";
    }

    public String createCheese() {
        return "Reggiano Cheese";
    }

    public String[] createVeggies() {
        String veggies[] = { "Garlic", "Onion", "Mushroom", "Red Pepper" };
        return veggies;
    }

    public String createPepperoni() {
        return "Sliced Pepperoni";
    }

    public String createClam() {
        return "Fresh Clams";
    }
}
