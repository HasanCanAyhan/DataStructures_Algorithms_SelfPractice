package queue_and_stack;

import java.util.*;

//https://youtu.be/rHQI4mrJ3cg

public class StackQueueDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); //FILO
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Integer pop = stack.pop();
        System.out.println(pop);

        System.out.println("--------------------------------------");

        Queue<Integer> queue = new LinkedList<>();//FIFO

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        Integer poll = queue.poll();//1
        Integer remove = queue.remove();
        System.out.println(remove);//2

        System.out.println("-----------------------------------------");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(33);
        deque.addLast(87);
        Integer removeLast = deque.removeLast();
        System.out.println(removeLast);
        Integer removeFirst = deque.removeFirst();
        System.out.println(removeFirst);

    }
}
