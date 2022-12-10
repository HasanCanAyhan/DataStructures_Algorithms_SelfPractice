package heap;

import java.util.NoSuchElementException;

public class CustomHeap_Review {

    int[] items;
    int size;

    public CustomHeap_Review(int capacity) {
        items = new int[capacity];
        size = 0;//default
    }

    public int peek() {

        if (size == 0) throw new NoSuchElementException(); // there is no value in the array

        return items[0];// everytime index zero is root

    }

    public void insert(int value) {

        if (size == items.length) throw new NoSuchElementException(); // bcs it is full
        else {
            items[size++] = value;
            bubbleUp();
        }

    }

    private void bubbleUp() {

        int startIndex = size - 1;

        while (startIndex > 0 && items[startIndex] > items[parentIndex(startIndex)]) {
            swap(startIndex, parentIndex(startIndex));
            //assign start index to parent index
            startIndex = parentIndex(startIndex);//to iterate, like curr = curr.next
        }

    }

    private void swap(int startIndex, int parentIndex) {

        int temp = items[startIndex];
        items[startIndex] = items[parentIndex];
        items[parentIndex] = temp;

    }

    private int parentIndex(int startIndex) {
        return (startIndex - 1) / 2;
    }


    public int remove() {
        int result = 0;
        if (size == 0) throw new NoSuchElementException();
        else {
            //change the lastItem with root
            result = items[0];// root
            items[0] = items[--size];
            bubbleDown();

        }

        return result;

    }

    private void bubbleDown() {

        int startIndex = 0;
        while (startIndex <= size ){
        int leftChildIndex = findLeftIndex(startIndex);
        int rightChildIndex = findRightIndex(startIndex);

        boolean hasLeftChild = hasLeftChild(leftChildIndex);
        boolean hasRightChild = hasRightChild(rightChildIndex);



            if (hasLeftChild && hasRightChild) {

                if (items[leftChildIndex] > items[rightChildIndex]) {


                        swap(startIndex, leftChildIndex);
                        startIndex = leftChildIndex;


                } else {


                        swap(startIndex, rightChildIndex);
                        startIndex = rightChildIndex;

                }

            }else if (hasLeftChild && !hasRightChild){

                    swap(startIndex, leftChildIndex);
                    startIndex = leftChildIndex;

            } else if (!hasLeftChild && hasRightChild) {

                    swap(startIndex, rightChildIndex);
                    startIndex = rightChildIndex;
            }

        }


    }


    private boolean hasRightChild(int rightChildIndex) {
        return rightChildIndex <= size;
    }

    private boolean hasLeftChild(int leftIndex) {

        return leftIndex <= size;

    }

    private int findRightIndex(int startIndex) {
        return (startIndex * 2) + 2;
    }

    private int findLeftIndex(int startIndex) {
        return (startIndex * 2) + 1;
    }


    public void printHeap() {

        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }

        System.out.println();
    }

}
