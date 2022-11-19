package recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,55,66,78};
        int target = 66;
        System.out.println(search(arr,target,0, arr.length-1));

    }

    public static int search(int[] arr, int target, int s, int e){ // target is index

        //start, end , medium
        //int s = 0;
        //int e = arr.length-1;

        if (s > e ) return -1; //no answer

        //divide arr into 2 half
        int m = s + (e-s) / 2;

        if (arr[m] == target){
            return m;
        }

        if (target < arr[m]){
            return search(arr,target,s,m-1); // search s <---- m-1
        }

        return search(arr,target,m+1, e);// search  m+1 ----> e

    }

}
