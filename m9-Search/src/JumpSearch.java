public class JumpSearch {

    public static int jumpSearch(int[] array, int data){

        int blockSize = (int)Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next-1] < data){// next -1 is last item of that block
            start = next;
            next += blockSize;
            if (next > array.length) next = array.length; // if length 10 , but next 13, next at the end should be equal array.length
        }

        for (int i = start ; i < next ; i++) {
            if (array[i] == data) return i;
        }

        return -1;



    }

}
