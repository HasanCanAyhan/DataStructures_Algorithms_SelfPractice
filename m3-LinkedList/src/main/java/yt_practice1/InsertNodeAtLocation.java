package yt_practice1;

import java.util.Objects;

public class InsertNodeAtLocation {

    Node head;

    private void insertAtLocation(int location, int data){

        int count = 0;
        Node current, previous;
        current = previous = head;

        Node newNode = new Node(data);

        if (location <= 1){
            newNode.setNext(head);
            head = newNode;
        }else{

            while (Objects.nonNull(current) && ++count != location){
                previous = current;
                current = current.next;
            }

            newNode.setNext(previous.next);
            previous.next = newNode;

        }

    }


    public static void main(String[] args) {

        InsertNodeAtLocation list = new InsertNodeAtLocation();

        //creating nodes

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        // link these nodes together

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        //printing each element of singly linked list

        PrintLinkedList.displayList(list.head);

        // perform insert node at given location

        list.insertAtLocation(3,25);

        PrintLinkedList.displayList(list.head);

    }

}
