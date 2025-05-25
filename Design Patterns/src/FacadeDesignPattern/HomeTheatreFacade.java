package FacadeDesignPattern;

public class HomeTheatreFacade {

    Light light;
    Projector projector;
    SoundSystem soundSystem;

    HomeTheatreFacade(Light light, Projector projector, SoundSystem soundSystem) {
        this.light = light;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    void watchMovie(String movieName) {
        System.out.println("Let's Watch movie " + movieName);
        light.dimLights();
        projector.projector();
        soundSystem.startSoundSystem();
    }

}
