package heap;

import java.util.NoSuchElementException;

/*
Useful Resources forHeap
//https://www.youtube.com/watch?v=HqPJF2L5h9U
//https://www.youtube.com/watch?v=leVBbOGDD2U
//https://www.youtube.com/watch?v=JS-5PA8hFA4&list=PLUUSh8du1azZEsdngPxMQGLnatId0V4h9&index=18
//https://www.youtube.com/watch?v=Q_eia3jC9Ts&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=103
//https://www.youtube.com/watch?v=NEtwJASLU8Q



 */
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


    public int remove(){
        if (size == 0) throw new NoSuchElementException();

        else {

            int result = items[0];
            items[0] = items[--size]; // we changed first//root with last item

            bubbleDown();

            return result;

        }

    }

    private void bubbleDown() {

        //first , we check which child is larger
        int index = 0; // root
        int largerChildIndex;
        while (index <= size && !isValidParent(index)){
           largerChildIndex = largerChildIndex(index);
           swap(index,largerChildIndex);
           index = largerChildIndex;
        }

    }

    private int largerChildIndex(int index) {
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)){
            return leftChildIndex(index);
        }else {
            return items[leftChildIndex(index)] > rightChildIndex(index) ? leftChildIndex(index) : rightChildIndex(index);
        }
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) return true; // is valid ->> parent should be grater than both children
        else {
            boolean isValid = false;
            if (hasRightChild(index)){
                isValid = (items[index] >= items[leftChildIndex(index)] && items[index] >= items[rightChildIndex(index)]);
            }

            return isValid;
        }
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }
    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    public int leftChildIndex(int index){
        return index*2 +1;
    }

    public int rightChildIndex(int index){
        return index*2 +2;
    }

    public void  printHeap(){

        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }

        System.out.println();
    }

}
