package searchMethods;

public class JumpSearch {

    public static int jumpSearch(int[] arr, int data){

        int blockSize = (int)Math.sqrt(arr.length);//3
        int start = 0;
        int next = blockSize;

        while (start < arr.length  && arr[next-1] < data ){ //if true, i will jump
            start = next;
            next += blockSize;

            if (next> arr.length)next = arr.length;

        }

        for (int i = start; i < next ; i++) {
            if (arr[i] == data)return i;
        }

        return -1;


    }

}
