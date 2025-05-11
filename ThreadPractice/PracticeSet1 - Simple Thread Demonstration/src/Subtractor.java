public class Subtractor extends Thread {
    Count count;
    Subtractor(Count count) {
        this.count = count;
    }

    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            int val = count.count;
            try {
                Thread.sleep(10); // Add delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count.count = val - 1;
        }
    }

}
