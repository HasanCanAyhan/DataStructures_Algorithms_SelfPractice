package yt_practice1;

import java.util.Objects;

public class InsertNodeAtMiddle {

    private Node head;

    // 10 -> 20 -> 30 -> 40 -> null
// s   ^
// f   ^

    private void insertAtMid(int data){

        Node newNode = new Node(data);

        if (Objects.isNull(head)){
            head = newNode;
        }else{
            Node slow, fast;
            slow = fast = head;
            while (Objects.nonNull(fast.next) && Objects.nonNull(fast.next.next)){
                slow = slow.next;
                fast = fast.next.next;
            }

            newNode.setNext(slow.next);
            slow.setNext(newNode);

        }

    }

    public static void main(String[] args) {

        InsertNodeAtMiddle list = new InsertNodeAtMiddle();

        list.insertAtMid(10);
        list.insertAtMid(20);
        list.insertAtMid(15);
        list.insertAtMid(40);
        list.insertAtMid(50);

        PrintLinkedList.displayList(list.head);


    }


}
