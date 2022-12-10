package searchMethods;

public class ExponentialSearch {


    public static int exponentialSearch(int[] arr, int data){

        int bound = 1;

        while (bound < arr.length && arr[bound] < data) bound *= 2;

        int left = bound / 2; // it is my left border
        int right = Math.min(bound,arr.length);// which one small then right border it is.

        return BinarySearch.binarySearchRecursive(arr,data,left,right); // binary search recursive!

    }

}
