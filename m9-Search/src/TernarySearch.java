public class TernarySearch {

    public static int ternarySearchIterative(int[] array, int data){

        int left = 0;
        int right = array.length-1;

        while (right >= left) {

            int partition = (right - left) / 3;
            int mid1 = left + partition;
            int mid2 = right - partition;
            if (array[mid1] == data) return mid1;
            if (array[mid2] == data) return mid2;

            if (data < array[mid1]) right = mid1 - 1;
            else if (data > array[mid2]) left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }

        }

        return -1;



    }


}
