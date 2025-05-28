package ObserverDesignPattern;

import java.util.Scanner;

public class ObserverPatternClient {

    private static NewsService newsService = new NewsService();

    public static void call() {
        System.out.println("Enter the subscriber to add");
        Scanner sc = new Scanner(System.in);
        String read = sc.nextLine();

        Observer observer = new EmailSubscriber(read);
        newsService.addSubscriber(observer);
        newsService.notifySubscribers("You have successfully subscribed for daily news");
    }

}
