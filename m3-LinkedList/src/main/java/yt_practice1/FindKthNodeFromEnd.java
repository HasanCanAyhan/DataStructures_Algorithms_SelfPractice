package yt_practice1;

import java.util.Objects;

//https://youtu.be/PHd5G7yXWQM

public class FindKthNodeFromEnd {

    Node head;

    Node tail;

    private int findKthNodeFromEnd(int k){

        if (Objects.isNull(head)){
            return 0;
        }

        // 1. find length of linked list
        // 2. extract the Kth node location
        // 3. iterate the node again until node pointer will not reach to kth node location

        int length = 0;
        Node current = head;

        while (Objects.nonNull(current)){

            length++;
            current = current.next;

        }
        // 10 - 20 - 30 - 40 - 50 -> null
        //                 c
        // l = 4 : stop


        // length = 5
        // k = 2;
        // location = length - k + 1;
        //              5    - 2 + 1 = 4

        current = head; // after line 27 current will be null , then start again
        int location = length - k + 1;

        length = 0;
        while(++length != location && Objects.nonNull(current)){
            current = current.next;
        }

        return Objects.nonNull(current) ? current.data : 0;



    }





    public static void main(String[] args) {

        FindKthNodeFromEnd list = new FindKthNodeFromEnd();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);



        // connect nodes together to frame a chain of linked list

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        int kthNodeFromEnd = list.findKthNodeFromEnd(2);
        System.out.println("kthNodeFromEnd = " + kthNodeFromEnd);


    }


}
