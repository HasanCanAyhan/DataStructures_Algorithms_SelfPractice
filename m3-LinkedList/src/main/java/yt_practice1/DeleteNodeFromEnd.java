package yt_practice1;

import java.util.Objects;

public class DeleteNodeFromEnd {

    // 10 -> null;

    // 10 -> 20 -> 30 -> 40 -> 50 -> null
    // ^ : current pointer


    private Node head;

    private void deleteFromEnd(){

        if (Objects.nonNull(head)){

            //create current pointer

            Node current = head;

            if (Objects.isNull(current.next)){ // only one element
                head = current.next; // null
            }else{ // multiple element

                while (Objects.nonNull(current.next.next)){
                    current = current.next;
                }

                current.setNext(null);

            }


        }else{
            System.out.println("Linked list is empty");
        }


    }

    public static void main(String[] args) {

        DeleteNodeFromEnd list = new DeleteNodeFromEnd();

        list.deleteFromEnd();

        System.out.println("-------------------------------");


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

        list.deleteFromEnd();

        PrintLinkedList.displayList(list.head);



    }

}
