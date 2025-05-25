import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    /*private List<Integer> list;
    private ExecutorService executor;

    MergeSort(List<Integer> list, ExecutorService executor) {
        this.list = list;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        if( this.list.size() <= 1 )
            return this.list;

        int mid = this.list.size() / 2;
        List<Integer> left = new ArrayList<>(this.list.subList(0, mid));
        List<Integer> right = new ArrayList<>(this.list.subList(mid, this.list.size()));

        MergeSort leftMergeSort = new MergeSort(left, executor);
        MergeSort rightMergeSort = new MergeSort(right, executor);

        Future<List<Integer>> leftFuture = executor.submit(leftMergeSort);
        Future<List<Integer>> rightFuture = executor.submit(rightMergeSort);

        //Implement Merge Sort Logic here -
        int i = 0;
        int j = 0;
        List<Integer> sortArray = new ArrayList<>();

        List<Integer> leftResult = leftFuture.get();
        List<Integer> rightResult = rightFuture.get();

        while( i < leftResult.size() && j < rightResult.size()) {
            if( leftResult.get(i) < rightResult.get(j) ) {
                sortArray.add(leftResult.get(i));
                i++;
            }
            else {
                sortArray.add(rightResult.get(j));
                j++;
            }
        }

        while( i < leftResult.size()  ) {
            sortArray.add(leftResult.get(i));
            i++;
        }
        while( j < rightResult.size() ) {
            sortArray.add(rightResult.get(j));
            j++;
        }

        return sortArray;


    }*/

    private List<Integer> arrToSort;
    private ExecutorService executorService;

    public MergeSort(List<Integer> arrToSort, ExecutorService executorService) {
        this.arrToSort = arrToSort;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size() <= 1) {
            return arrToSort;
        }

        int mid = arrToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArray.add(arrToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i = mid; i < arrToSort.size(); i++) {
            rightArray.add(arrToSort.get(i));
        }

        MergeSort leftMergeSorter = new MergeSort(leftArray, executorService);
        MergeSort rightMergeSorter = new MergeSort(rightArray, executorService);

        Future<List<Integer>> sortedLeftArrayFuture =
                executorService.submit(leftMergeSorter);
        Future<List<Integer>> sortedRightArrayFuture =
                executorService.submit(rightMergeSorter);

        int i = 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArray = sortedRightArrayFuture.get();

        while(i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if(sortedLeftArray.get(i) < sortedRightArray.get(j)) {
                sortedArray.add((sortedLeftArray.get(i)));
                i++;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j++;
            }
        }

        while(i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i++;
        }

        while(j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j++;
        }

        return sortedArray;
    }

}
