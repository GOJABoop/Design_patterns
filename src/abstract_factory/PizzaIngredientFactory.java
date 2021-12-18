package abstract_factory;

public interface PizzaIngredientFactory {
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String[] createVeggies();
    public String createPepperoni();
    public String createClam();
}
