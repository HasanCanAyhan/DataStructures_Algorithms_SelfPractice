package queues.yt_practice;

import org.w3c.dom.Node;

public class ClientTest {

    public static void main(String[] args) {


        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.enQueue(50);

        //System.out.println("size : " + myQueue.size());
        //myQueue.displayQueue();
        //System.out.println("dequeued item : " + myQueue.deQueue());//FIFO
        myQueue.displayQueue();

        System.out.println("-------------------------");

        int k = 4;
        myQueue.reverseOrderKtkQueue(4);

    }


}
