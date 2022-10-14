package queues;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {

    public static void main(String[] args) {

        //FIFO

        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);

        System.out.println(mq.dequeue());//1
        System.out.println(mq.dequeue());//2

        Queue<Integer> cq = new LinkedList<>();
        cq.add(1);
        cq.add(3);
        System.out.println(cq.remove());
        System.out.println(cq.remove());


    }

}
