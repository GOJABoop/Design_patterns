package iterator_and_composite;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        this.menus.print();
    }
}
