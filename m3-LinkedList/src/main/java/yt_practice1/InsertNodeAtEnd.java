package yt_practice1;

import java.util.Objects;

public class InsertNodeAtEnd {

    Node head;

    private void insertAtEnd(int data) {

        //if head is null then add newly node as first node of singly linked list
        // and head will start pointing to newly created node

        Node newNode = new Node(data);
        if (Objects.isNull(head)){
            head = newNode;
        }else{ // if nodes are available then add newly created node in the end of singly linked list
            Node current = head; // current pointer , keeping copy of head
            while (Objects.nonNull(current.next)){
                current = current.next;
            }

            current.setNext(newNode);
        }

    }

    public static void main(String[] args) {


        InsertNodeAtEnd list = new InsertNodeAtEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // printing all the elements
        PrintLinkedList.displayList(list.head);

    }


}
