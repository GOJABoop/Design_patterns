package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvd = new DvdPlayer(amplifier);
        Projector projector = new Projector(dvd);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvd, projector,
                                                                screen, lights, popper);

        homeTheater.watchMovie("La La Land");
        homeTheater.endMovie();
    }
}
