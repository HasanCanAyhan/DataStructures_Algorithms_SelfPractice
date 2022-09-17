package yt_practice1;

import java.util.Objects;

public class DeleteNodeFromMiddle {

    private Node head;

    private void deleteFromMiddle(){

        //EVEN EX:
        // 10 -> 20 -> 30 -> 40 -> null
        //       p
        //             s
        //                          f

        //ODD EX:
        // 10 -> 20 -> 30 -> 40 -> 50 -> null
        //       p
        //             s
        //                         f


        if (Objects.nonNull(head)){

            //pointer approach

            Node previous, slow , fast ;
            previous = slow = fast = head;

            while (Objects.nonNull(fast) && Objects.nonNull(fast.next)){
                previous = slow;
                slow = slow.next; // one step
                fast = fast.next.next; // two step
            }

            //30 will be removed
            previous.setNext(slow.next);


        }else{
            System.out.println("Linked list is empty");
        }

    }

    public static void main(String[] args) {

        DeleteNodeFromMiddle list = new DeleteNodeFromMiddle();

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

        list.deleteFromMiddle();

        PrintLinkedList.displayList(list.head);


    }


}
