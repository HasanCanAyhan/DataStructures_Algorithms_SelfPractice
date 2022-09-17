package lesson;

import java.util.Objects;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {

        return head == null;

    }

    void add(int data) {
        //create a new object from data
        Node newNode = new Node(data);


        if (isEmpty()) { // if the list is empty
            head = tail = newNode;
            size++;
        } else {
            tail.nextAddress = newNode;
            tail = newNode;
            size++;
        }

    }


    void deleteById(int id) {

        // check if empty

        if (isEmpty()) System.out.println("List is empty");

        // assign prev and current with the head

        Node previous, current;
        previous = current = head;
        while (current != null) {

            if (current.id == id) {//if there is a match

                //case 1: head

                if (current == head) {
                    head = current.nextAddress;
                    current.nextAddress = null;
                }
                //case 2: tail
                else if (current == tail) {
                    tail = previous;
                    previous.nextAddress = null;
                }

                //case 3: middle

                else {

                    previous.nextAddress = current.nextAddress;
                    current.nextAddress = null; // Garbage Collection

                }


                //after deletion
                size--;

            }
            //move forward on the elements of the list
            previous = current;
            current = current.nextAddress;

        }


    }


    int indexOf(int id) {

        if (isEmpty()) return -1;
        int pos = 0;

        // iterate through the list

        Node current = head; // set my current with the starting element

        while (current != null){

            if (current.id == id) return pos;
            pos++;
            current = current.nextAddress;

        }

        return -1;
    }


    void addFirst(int data){

        Node newNode = new Node(data);

        if (isEmpty()){
            head = tail = newNode;
        }else{
            newNode.nextAddress = head;   // newNode --->>> Head
            head = newNode; // we updated head for newNode
        }

        size++;

    }

    public int getKthItemFromLast(int k){

        // create two pointers

        Node ptr1 = head;
        Node ptr2 = head;

        //move ptr2  k-1 times
        for (int i = 0; i < k -1 ; i++) {

            ptr2 = ptr2.nextAddress;
        }

        //move both pointers until ptr2 hits the last element
        while(ptr2.nextAddress != null){
            ptr2 = ptr2.nextAddress;
            ptr1 = ptr1.nextAddress;
        }

        //ptr1 is on the kth element from the last
        return ptr1.id;


    }

    public void removeKthItemFromLast(int k){

        // create three pointers

        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        //move ptr2  k-1 times
        for (int i = 0; i < k -1 ; i++) {

            ptr2 = ptr2.nextAddress;
        }

        //move both pointers until ptr2 hits the last element
        while(ptr2.nextAddress != null){
            prev = ptr1;
            ptr2 = ptr2.nextAddress;
            ptr1 = ptr1.nextAddress;
        }

        //ptr1 is on the kth element from the last
        // do delete operation 3 cases : head, tail, middle

        if (ptr1 == head){
            head = ptr1.nextAddress;
            ptr1.nextAddress = null;
            size--;
        } else if (ptr1 == tail) {
            tail = prev;
            prev.nextAddress = null;
            size--;
        }else{

            prev.nextAddress = ptr1.nextAddress;
            ptr1.nextAddress = null;
            size--;
        }

    }

    public void removeKthFromLast2(int k){
        Node ptr1=head;
        Node ptr2=head;
        for(int i=0;i<k-1;i++) {

            ptr2=ptr2.nextAddress;

            if (ptr2==null)  System.out.println("Less than k elements");

            else if(ptr2.nextAddress==null){
                head=ptr1.nextAddress;
                ptr1.nextAddress=null;
                return;
            }
        }
        while(ptr2.nextAddress.nextAddress!=null) {

            ptr1=ptr1.nextAddress;
            ptr2=ptr2.nextAddress;

        }

        ptr1.nextAddress=ptr1.nextAddress.nextAddress;
        ptr1=ptr1.nextAddress;
        ptr1=null;


    }



    void printNodes() {

        Node current = head;

        while (current != null) {
            System.out.print(current.id + " -> ");
            current = current.nextAddress;
        }

        System.out.println("null");

    }


}
