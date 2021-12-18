package abstract_factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public String createDough() { //Dough
        return "Thick Crust Dough"; //new ThickCrustDough();
    }

    public String createSauce() { //Sauce
        return "Plum Tomato Sauce"; //new PlumTomatoSauce();
    }

    public String createCheese() { //Cheese
        return "Mozarella"; //new Mozzarella();
    }

    public String[] createVeggies() { //Veggies[]
        String veggies[] = { "Egg plant", "Spinach", "BlackOlives" };
        return veggies;
    }

    public String createPepperoni() { //Pepperoni
        return "Sliced Pepperoni"; //new SlicedPepperoni();
    }

    public String createClam() { //Clam
        return "Frozen clam"; //new FrozenClams();
    }
}
