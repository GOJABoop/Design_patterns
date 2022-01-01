package facade;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void tvMode() {
        System.out.println("Projector is on TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector is on wide screen mode");
    }
}

