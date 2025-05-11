import java.util.concurrent.Callable;

public class SimpleThreadDemo implements Callable<Integer>, Runnable {

    @Override
    public void run() {
        System.out.println("SimpleThreadDemo started");
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("This is call function from SimpleThreadDemo class");
        return 0;
    }
}
