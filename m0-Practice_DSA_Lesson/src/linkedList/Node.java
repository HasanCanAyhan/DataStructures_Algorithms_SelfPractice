package linkedList;

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
    }


}

