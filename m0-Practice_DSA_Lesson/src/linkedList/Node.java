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


    public int sumOfNodesOfLinkedList(Node head){

        int sum = 0;
        Node curr = head;
        while (curr != null){
            sum += curr.val;
            curr = curr.next;
        }

        return sum;
    }



    public int sumOfNodesOfLinkedList_recursive(Node head) {

        if (head == null) return 0;

        int curr = sumOfNodesOfLinkedList_recursive(head.next);
        return head.val + curr;


    }


    public int sumOfNodesOfLinkedList_recursive2(Node head) {

        int sum = 0;
        sum += callSumRecursively(head,sum);
        return sum;


    }

    public int callSumRecursively(Node head, int sum) {

        if (head == null) return sum;

        sum += head.val;

        return callSumRecursively(head.next,sum);
    }

    public boolean findNode(Node head, int val){

        Node curr = head;
        while (curr != null){
            if (curr.val == val ) {
                System.out.println(curr.val);
                return true;
            }
            curr = curr.next;
        }

        return false;
    }


    public boolean findNode_recursive(Node head, int target){

        if (head == null) return false;// it means we could not find the specific node

        if (head.val == target) return true;

        return findNode_recursive(head.next,target);

    }


    public int getNodeValue(Node head, int index){

        if (head == null) return -1;

        Node curr = head;
        int count = 0;

        while (curr != null){

            if (index == count) return curr.val;
            count++;
            curr = curr.next;
        }

        return -1;
    }


    public int getNodeValue_recursive(Node head, int index){ // head, 2 ,   1 2 3 4 ==>> 3

        if (head == null) return -1;

        if (index == 0) return head.val;

        return getNodeValue_recursive(head.next,index-1);



    }


    public void callRecursive_reversed(Node head) {

        if (head == null) {
            return;
        }

        callRecursive_reversed(head.next);
        System.out.print(head.val + " -> ");


    }


    public void reversedLinkedList(Node head){

        Node prev = null;
        Node curr = head;

        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while (prev != null) {
            System.out.print(prev.val + " -> ");
            prev = prev.next;
        }
        System.out.println("null");

    }


    public Node zipperLists(Node head1, Node head2){


        Node tail = head1;
        Node curr1 = head1.next;
        Node curr2 = head2;

        int count = 0;
        while (curr1 != null && curr2 != null){

            if(count %2 == 0){
                tail.next = curr2;
                curr2 = curr2.next;
            }else {
                tail.next = curr1;
                curr1 = curr1.next;
            }
            tail = tail.next;

            count ++;

        }

        if (curr1 != null) tail.next = curr1;
        if (curr2 != null) tail.next = curr2;

        return head1;

    }


    public Node zipperLists_recursive(Node head1, Node head2){

        if (head1 == null && head2 == null) return null;
        if (head1 == null) return head2;
        if (head2 == null) return head1;


        Node next1 = head1.next;
        Node next2 = head2.next;

        head1.next = head2;
        head2.next = zipperLists_recursive(next1,next2);

        return head1;
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

        System.out.println();
        System.out.println("--------------------");

        System.out.println( node.sumOfNodesOfLinkedList_recursive(node.next));

        System.out.println(node.sumOfNodesOfLinkedList_recursive2(node.next));

        System.out.println();
        System.out.println("--------------------");


        System.out.println(node.findNode(node.next,55));

        System.out.println(node.findNode_recursive(node.next,3));

        System.out.println();
        System.out.println("--------------------");

        System.out.println(node.getNodeValue_recursive(node.next,2));


        System.out.println();
        System.out.println("--------------------");

        node.callRecursive_reversed(node.next);

        System.out.println();
        System.out.println("--------------------");

        node.reversedLinkedList(node.next);

    }


}

