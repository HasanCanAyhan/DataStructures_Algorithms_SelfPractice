package linkedList;

//https://youtu.be/Hj_rA0dhr2I

import java.util.ArrayList;
import java.util.List;

public class Node {

    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }


    public void printLinkedList(Node head){

        Node current = head;

        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null");

    }

    public void printLinkedList_recursive(Node head){

        if (head == null) {
            System.out.println("null");
            return;
        }

        System.out.print(head.val +" -> ");

        printLinkedList_recursive(head.next);

    }

    public List<Integer> showValuesOfLinkedList(Node head){

        List<Integer> list = new ArrayList<>();

        Node curr = head;

        while (curr != null){
            list.add(curr.val);

            curr = curr.next;
        }

        return list;

    }

    public List<Integer> showValuesOfLinkedList_recursive(Node head){ //main function for recursive

        List<Integer> list = new ArrayList<>();
        fillValues(head,list);
        return list;

    }

    private void fillValues(Node head, List<Integer> list) {

        if (head == null) return;
        list.add(head.val);
        fillValues(head.next,list);

    }


    public static void main(String[] args) {

        Node node = new Node();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        node.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        node.printLinkedList(a);

        System.out.println();
        System.out.println("--------------------");

        node.printLinkedList_recursive(a);

        System.out.println();
        System.out.println("--------------------");

        System.out.println( node.showValuesOfLinkedList(node.next) );


        System.out.println();
        System.out.println("--------------------");

        System.out.println( node.showValuesOfLinkedList_recursive(node.next));


    }


}

