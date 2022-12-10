package heap;

public class KthLargestElementInGivenArrayMaxHeap_customHeap {

    public static void main(String[] args) {

        int[] num = {3,2,1,5,6,4};
        System.out.println(getKthLargest(num,2));

    }

    public static int getKthLargest(int[] arr, int k ){

        //create heap

        MyHeap myHeap = new MyHeap(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            myHeap.insert(arr[i]);
        }

        for (int i = 0; i < k-1  ; i++) {
            myHeap.remove();
        }


        return myHeap.peek();

    }



}
