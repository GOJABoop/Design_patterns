package facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector,
                             Screen screen, TheaterLights lights, PopcornPopper popper) {
        this.amplifier = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
