package yt_practice;

import java.util.Stack;

//https://youtu.be/c_mjlnOhHT4
public class MinElementInStack {


   Stack<Integer> originalStack = new Stack<>();
   Stack<Integer> minStack = new Stack<>();

    int push(int element){

        if (minStack.isEmpty() || element < minStack.peek()){
            minStack.push(element);
        }

        return originalStack.push(element);
    }

    int peek(){
        return originalStack.peek();
    }

    int pop(){

        int removedElement = originalStack.pop();
        if (removedElement == minStack.peek()){
            minStack.pop();
        }

        return removedElement;

    }

    int minElement(){

        return minStack.peek();

    }

    public static void main(String[] args) {

        MinElementInStack stack = new MinElementInStack();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(12);
        stack.push(2);

        System.out.println("Top element : " + stack.peek());
        System.out.println("minimum element : " + stack.minElement());

        System.out.println("Deleting the top  element : " + stack.pop());


        System.out.println("Deleting the top  element : " + stack.pop());
        System.out.println("minimum element : " + stack.minElement());



    }

}
