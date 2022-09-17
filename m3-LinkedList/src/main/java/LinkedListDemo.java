import java.util.ArrayList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // create 4 nodes - instance

        //they are not inside a list
        Node node1 = new Node(1);

        System.out.println(node1);//Node@6d03e736
        System.out.println("Next address is : " + node1.next); //null
        System.out.println("----------------------------------------");

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // we have list right now
        node1.next = node2;
        node2.next = node3;
        node3.next = node4; // last element


        System.out.println("Node1 's address is: " + node1 + " Node1's next address is : " + node1.next);
        System.out.println("Node2 's address is: " + node2 + " Node2's next address is : " + node2.next);
        System.out.println("Node3 's address is: " + node3 + " Node3's next address is : " + node3.next);
        System.out.println("Node4 's address is: " + node4 + " Node4's next address is : " + node4.next);

        System.out.println("----------------------------------------------");

        Node current; // temporary value
        Node head = node1; // first -head
        current = head;
        while (current != null){
            System.out.println("Id of node is: " + current.id);
            current = current.next;
        }

        System.out.println("--------------------");

        ArrayList<Node> nodeArrayList = new ArrayList<>();



    }


}
