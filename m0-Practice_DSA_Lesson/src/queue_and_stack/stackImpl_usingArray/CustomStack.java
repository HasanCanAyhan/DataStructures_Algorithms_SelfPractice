package queue_and_stack.stackImpl_usingArray;

import java.util.Arrays;
import java.util.Collections;

public class CustomStack<T> {

    private int MAX;
    private int TOP; // default zero
    Object[] stack;

    public CustomStack(int size){
        stack = new Object[size];
        this.MAX = size;
    }

    public T push(T item) throws Exception {

        if(isFull()){
            throw new Exception("Stack Over Flow");
        }

        stack[TOP++] = item;
        return item;
    }


    public void show() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack Under Flow");
        }
        Arrays.stream(stack).forEach(System.out::println);
    }


    public Object peek() throws Exception {

        if (isEmpty()){
            throw new Exception("Stack Under Flow");
        }
        return stack[TOP-1];

    }

    public Object pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack Under Flow");
        }
       return stack[--TOP];
    }

    //Stack overflow
    //1. stack is full while inserting
    //2. stack is empty while deleting

    public boolean isFull(){
        return TOP >= MAX;
    }

    public boolean isEmpty(){
        return TOP <= 0;
    }


}
