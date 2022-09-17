package yt_practice.StackImplementation_usingLinkedList;

public class StackUsingLinkedList {

    public static void main(String[] args) {

        StackLinkedListService stack = new StackLinkedListService();
        stack.push(10);
        stack.push(20);
        stack.push(8);
        stack.push(12);

        System.out.println("Deleted element of stack : " + stack.pop());

        System.out.println("Top element of stack : " + stack.peek());



    }

}
