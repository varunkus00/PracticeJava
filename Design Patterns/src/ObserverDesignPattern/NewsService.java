package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsService {

    List<Observer> observers = new ArrayList<Observer>();

    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer observer : observers) {
            observer.notifySubscribers(message);
        }
    }

}
