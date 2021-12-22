package command;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Upping door");
    }

    public void down() {
        System.out.println("Downing door");
    }
}
