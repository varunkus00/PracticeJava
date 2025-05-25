package FacadeDesignPattern;

public class FacadePatternClient {
    static Light light = new Light();
    static Projector projector = new Projector();
    static SoundSystem soundSystem = new SoundSystem();

    public static void call() {
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(light, projector, soundSystem);
        homeTheatreFacade.watchMovie("The Lord of the Rings");
    }

}
