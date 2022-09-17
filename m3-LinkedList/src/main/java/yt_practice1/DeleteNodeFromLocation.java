package yt_practice1;

import java.util.Objects;

//https://youtu.be/jzmaokx3nsA

public class DeleteNodeFromLocation {

    // 10 -> 20 -> 30 -> 40 -> 50 -> null
    //            pre
    //                   crr : stops

    //countLoc = 4
    //location : 4
    Node head;

    private void deleteFromLocation(int location) {

        if (Objects.nonNull(head)) {

            if (location <= 1) {
                head = head.next;
            } else {


                //two pointer

                int countLoc = 0;
                Node current, previous;
                current = previous = head; //initially

                while (Objects.nonNull(current) && ++countLoc != location) {
                    previous = current;
                    current = current.next;
                }

                if (countLoc >= location) {
                    previous.setNext(current.next);
                } else {
                    System.out.println("Wrong location");
                }

            }

        } else {
            System.out.println("Linked list is empty");
        }

    }


    public static void main(String[] args) {

        DeleteNodeFromLocation list = new DeleteNodeFromLocation();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        PrintLinkedList.displayList(list.head);

        list.deleteFromLocation(3);

        PrintLinkedList.displayList(list.head);

    }

}
