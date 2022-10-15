package queues.yt_practice;

import java.util.Stack;

public class MyQueue<T> {

     Node<T> front;
     Node<T> rear;

    private int length;

    private static class Node<T>{
        private final T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }

    }


    public void enQueue(T data){

        if (front == null){
            rear = new Node<>(data);
            front = rear;
        }else{
            rear.next = new Node<>(data);
            rear = rear.next;
        }

        length++;

    }



    public T deQueue(){

        if (front != null){//there is data
            T result = front.data;
            front = front.next;
            length--;
            return result;
        }

        return null;
    }

    public int size(){
        return length;
    }

    public void displayQueue(){

        Node<T> currentNode = front;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }


    public void reverseOrderKtkQueue(int k){
        //Interview Question : how do we reverse the order of a queue?
        //10,20,30,40,50


        Stack<T> stack = new Stack<>();
        Node<T> currentNode = front;
        for (int i = 0; i < k ; i++) {
            stack.push(currentNode.data);
            currentNode = currentNode.next;
        }

        MyQueue<T> myQueue = new MyQueue<>();
        for (int i = 0; i < k ; i++) {
            myQueue.enQueue(stack.pop());
        }

        myQueue.displayQueue();



    }


}
