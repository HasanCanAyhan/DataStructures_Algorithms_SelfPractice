package ReverseLinkedList;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
     static void reverse(MySinglyLinkedList list) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> null
  // prev  ^
  // current    ^
  // nextN           ^

         // create two pointers
         Node prev = list.head;
         Node current = list.head.next;

         while(current != null){
             Node nextNode =current.next;
             current.next = prev; // change direction of current to prev
             prev = current;// move prev to right to the current
             current = nextNode; //
         }
         // now adjust tail and head
         list.tail = list.head;
         list.tail.next = null;
         list.head = prev;


    }
}
