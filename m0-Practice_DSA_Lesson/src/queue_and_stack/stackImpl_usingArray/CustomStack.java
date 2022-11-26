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


    public void show() {
        Arrays.stream(stack).forEach(System.out::println);
    }


    public Object peek() {

        return stack[TOP-1];

    }

    public Object pop() {
       return stack[--TOP];
    }

    public boolean isFull(){
        return TOP >= MAX;
    }


}
