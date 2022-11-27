package heap;

import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;


    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public int peek(){
        if (size == 0) throw new NoSuchElementException();
        return items[0]; // everytime index zero is root
    }

    /*
    • Basic Integer Heap Implementation with Arrays
• Methods :
- Insert(int value)
- BubbleUp()
- BubbleDown()
- Remove()

- LeftChildIndex ()
- RightChildIndex()
- ParentIndex()
- HasLeftChild()
- HasRightChild()
     */

    public void insert(int value){

        if (size == items.length) throw new StackOverflowError(); // bcs full
        else {

          //we add item
            //items[7] = 89;
            items[size++] = value;
            bubbleUp();

        }



    }

    private void bubbleUp() {

        //calculate start point/index -->> size -1
        int startIndex = size-1; // startIndex also childIndex
        // while startIndex > 0 && parent is less than child continue
        // 1. swap child and parent
        // calculate next index = parent index

        while (startIndex > 0 && items[startIndex] > items[parentIndex(startIndex) ]){
            //swap
            swap(startIndex, parentIndex(startIndex));
            //assign start index to parent index
            startIndex = parentIndex(startIndex);// like curr = curr.next

        }


    }


    public void swap(int startIndex, int parentIndex){
       int temp = items[startIndex];

       items[startIndex] = items[parentIndex];
       items[parentIndex] = temp;

    }

    public int parentIndex(int startIndex){
        return (startIndex -1) / 2;
    }


    public void  printHeap(){

        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }

        System.out.println();
    }

}
