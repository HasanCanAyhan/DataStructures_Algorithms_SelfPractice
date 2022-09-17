package yt_practice1;

public class InsertNodeAtBeginning {

    private Node head;

    private void insertAtBeginning(int data) {

        // create new node which you want to insert at beginning of the linked list

        Node newNode = new Node(data);

        if (head != null){
            newNode.next = head; // should point to head
        }
        head = newNode;

    }


    public static void main(String[] args) {

        InsertNodeAtBeginning list = new InsertNodeAtBeginning();

        //insert node at the beginning

        list.insertAtBeginning(40);
        list.insertAtBeginning(30);

        //print all the elements of linked list
        PrintLinkedList.displayList(list.head);


        list.insertAtBeginning(50);
        list.insertAtBeginning(20);
        list.insertAtBeginning(100);

        PrintLinkedList.displayList(list.head);



    }

}
