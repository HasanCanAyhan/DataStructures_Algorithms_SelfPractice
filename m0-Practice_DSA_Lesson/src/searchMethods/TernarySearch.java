package searchMethods;

public class TernarySearch {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        System.out.println(ternarySearchIterative(arr,7));
    }


    public static int ternarySearchIterative(int[] arr, int data) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;

            if (data == arr[mid1]) return mid1;
            if (data == arr[mid2]) return mid2;
            if (data < arr[mid1]) right = mid1 - 1;
            else if (data > arr[mid2]) left = mid2 + 1;
            else { // it there is between mid1 and mid2
                left = mid1 + 1;
                right = mid2 - 1;
            }

        }

        return -1;
    }


    public static int ternarySearchRecursive(int[] arr, int data, int left, int right) {

        if (left > right) return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (data == arr[mid1]) return mid1;
        if (data == arr[mid2]) return mid2;

        if (data < arr[mid1]) return ternarySearchRecursive(arr,data,left, mid1-1);
        if (data > arr[mid2]) return ternarySearchRecursive(arr,data,mid2+1, right);
        else return ternarySearchRecursive(arr,data,mid1+1,mid2-1);



    }

}
