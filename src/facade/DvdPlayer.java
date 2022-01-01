package facade;

public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
       System.out.println("DVD player is on");
    }

    public void off() {
        System.out.println("DVD player is off");
    }

    public void eject() {
        System.out.println("DVD player is ejecting DVD");
    }

    public void pause() {
        System.out.println("DVD player is on pause");
    }

    public void play(String movie) {
        System.out.println("DVD player is playing: " + movie);
    }

    public void setSurroundAudio() {
        System.out.println("DVD player is setting surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD player is setting two channel of audio");
    }

    public void stop() {
        System.out.println("DVD player is stopped");
    }
}
