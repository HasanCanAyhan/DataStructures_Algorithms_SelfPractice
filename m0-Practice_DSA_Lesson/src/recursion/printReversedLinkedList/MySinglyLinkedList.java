package recursion.printReversedLinkedList;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {

        return head == null;

    }


    public  void printReversedLinkedList(Node head){

        if (head == null) return;
        printReversedLinkedList(head.nextAddress);
        System.out.print(head.id + "->");

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



    void printNodes() {

        Node current = head;

        while (current != null) {
            System.out.print(current.id + " -> ");
            current = current.nextAddress;
        }

        System.out.println("null");

    }


}
