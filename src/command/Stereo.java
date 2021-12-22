package command;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Stereo on");
    }

    public void off() {
        System.out.println(location + " Stereo off");
    }

    public void setCD() {
        System.out.println(location + " Stereo setting London Calling - The Clash");
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to: " + volume);
    }
}
