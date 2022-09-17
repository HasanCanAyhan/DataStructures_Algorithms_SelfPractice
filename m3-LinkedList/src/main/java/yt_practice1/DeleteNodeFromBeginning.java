package yt_practice1;

import java.util.Objects;

public class DeleteNodeFromBeginning {

    private Node head;

    private void deleteNodeFromBeginning(){

        if (Objects.nonNull(head)){
            head = head.next;
        }

    }

    public static void main(String[] args) {

        DeleteNodeFromBeginning list = new DeleteNodeFromBeginning();

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


        list.deleteNodeFromBeginning();


        PrintLinkedList.displayList(list.head);

        list.deleteNodeFromBeginning();


        PrintLinkedList.displayList(list.head);



    }


}
