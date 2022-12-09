package heap;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class KthLargestElementInGivenArrayMaxHeap {

    public static void main(String[] args) {

        int[] arr = {10,7,11,30,20,38,2,45};
        int k = 3;

        System.out.println(kthLargestElementInGivenArrayMaxHeap(arr,3));

    }

    public static int kthLargestElementInGivenArrayMaxHeap(int[] arr, int k){

        if (arr.length < k){
            throw new NoSuchElementException();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }


        for (int i = 0; i < k-1 ; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();


    }



}
