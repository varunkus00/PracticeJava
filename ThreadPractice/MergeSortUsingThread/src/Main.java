import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(6);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        MergeSort mergeSorter = new MergeSort(list, executorService);
        Future<List<Integer>> sortedArrayFuture =
                executorService.submit(mergeSorter);

        System.out.println(sortedArrayFuture.get());
        executorService.shutdown();
    }
}