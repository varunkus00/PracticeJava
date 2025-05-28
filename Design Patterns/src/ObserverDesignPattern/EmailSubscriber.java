package ObserverDesignPattern;

public class EmailSubscriber implements Observer {

    String observerName;

    EmailSubscriber(String observerName) {
        this.observerName = observerName;
    }

    public void notifySubscribers(String message) {
        System.out.println("Notifying subscribers: " + message);
    }

}
