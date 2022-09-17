package yt_practice1;

public class PrintLinkedList {

    //10 -> 20 -> 30 -> 40 -> null
    public  static  void  displayList(Node head){

        Node current = head;
        while(current != null){
            System.out.print(current.getData() + " -> " );
            current = current.next;
        }

        System.out.println("null");

    }

}
