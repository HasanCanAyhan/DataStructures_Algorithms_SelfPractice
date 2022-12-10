package serachMethods;

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchRecursive(arr,6,0,arr.length-1)); // index:5

    }

    public static int binarySearchIterative(int[] array,int data){

        int left = 0;
        int right = array.length-1;

        while (left <= right){

            int middle = (left + right) /2 ; // that is index , and this middle index each time will be updated
            if (array[middle] == data) return middle;
            if (data< array[middle]) right = middle -1;
            else left = middle +1;

        }

        return -1;


    }

    public static int binarySearchRecursive(int[] arr,int target, int s, int e){
        //start, end , medium
        //int s = 0;
        //int e = arr.length-1;

        if (s > e ) return -1; //no answer

        //divide arr into 2 half
        int m = (e + s) /2;

        if (arr[m] == target){
            return m;
        }

        if (target < arr[m]){
            return binarySearchRecursive(arr,target,s,m-1); // search s <---- m-1
        }

        return binarySearchRecursive(arr,target,m+1, e);// search  m+1 ----> e


    }




}
