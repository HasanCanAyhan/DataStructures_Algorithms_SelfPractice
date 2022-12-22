import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        int[] numbers = {7,2,4,6,1,9,-1};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers))); //[-1, 1, 2, 4, 6, 7, 9]

        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));//[-1, 1, 2, 4, 6, 7, 9]

        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(InsertionSort.insertionSort(numbers)));

        System.out.println("-------------------------------");

        JD1MergeSort.mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------");

        JD1QuickSort.qSort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));


    }

}
