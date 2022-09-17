package yt_practice;

import java.util.Arrays;
import java.util.Objects;

public class Stack<T> {

    private int MAX;
    private int TOP;
    Object[] stack;

    public Stack(int size){
        stack = new Object[size];
        this.MAX = size;
    }

    public T push(T item){
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


}
