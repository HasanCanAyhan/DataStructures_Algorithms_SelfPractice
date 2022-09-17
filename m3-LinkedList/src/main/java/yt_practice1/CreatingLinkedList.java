package yt_practice1;

//https://youtu.be/jzmaokx3nsA

public class CreatingLinkedList {

    /*
    1.head -> first node
    2.node -> data/value & reference/address of next node
    3.last node -> null
     */

    private Node head;

    public static void main(String[] args) {

        // creating multiple nodes

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);


        // connect nodes together to frame a chain of linked list

        CreatingLinkedList list = new CreatingLinkedList();
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;


        PrintLinkedList.displayList(list.head);




    }



}
