package yt_practice;

public class LinkedList {

    Node head;

    public void insert(int data){ // 18

        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null){
            head = node;
        }

        else{

            Node n = head; // like current, template  which holds data
            while (n.next != null){
                n = n.next;//jumping to another node
            }

            n.next = node;

        }


    }


    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;


    }

    public void insertAt(int index, int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

       if (index == 0){
           insertAtStart(data);
           return;
       }

        Node n = head;

        for (int i = 0; i <index -1 ; i++) {

            n = n.next;
        }

        node.next = n.next;
        n.next = node;


    }

    public void deleteAt(int index){

        if (index == 0){
            //change the head location
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index -1; i++) {
                n = n.next;
            }

            n1 = n.next; // n1 nodu n.next de tutuluyor
            n.next = n1.next;//to change, n.next = n1.next i atamaliyiz ki n1.next diger nodu tutuyor.
            System.out.println("n1 " + n1.data);

            n1 = null; // for GC


        }


    }


    public void show(){

        Node node = head;

        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }

        System.out.println(node.data);

    }

}
