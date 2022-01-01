package facade;

public class Amplifier {
    DvdPlayer dvdPlayer;

    public Amplifier() {

    }
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setDvd(DvdPlayer dvd) {

    }

     public void setSurroundSound() {

     }

    public void setVolume(int volume) {
        System.out.println("Volume is set to: " + volume);
    }
}
