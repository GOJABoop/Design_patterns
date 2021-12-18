package abstract_factory;


public class AbstractPizzaFranchise {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza;

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.toString()+ "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");
    }
}
