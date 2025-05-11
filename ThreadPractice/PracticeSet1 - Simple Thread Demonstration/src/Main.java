//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtract = new Subtractor(count);

        adder.start();
        subtract.start();

        try {
            adder.join();
            subtract.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final count value: " + count.count);
    }
}