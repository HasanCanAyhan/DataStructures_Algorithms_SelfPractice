package yt_practice.StackImplementation_usingLinkedList;

public class StackLinkedListService {

    //push, pop , peek,


    /*
     node -> 18   node.next -> null

     top -> 18
            10
            30
            5
            12
     */


    Node top;

    public void push(int data){

        if (top == null){
           top =  new Node(data);
        }else{
            Node node = new Node(data);
            node.next = top;
            top = node;
        }

    }

    public int pop(){
        int removedNode = -1;
        if (top == null){
            System.err.println("Stack underflow");
        }else{
            removedNode = top.data;
            top = top.next;
        }
        return removedNode;

    }

    public int peek(){

        int topElement = -1;
        if (top==null){
            System.err.println("Stack is empty");
        }else{
            topElement =  top.data;
        }

        return topElement;

    }


}
