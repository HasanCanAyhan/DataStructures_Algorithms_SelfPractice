package queue_and_stack.stackImpl_usingLinkedlIst;

public class StackLinkedList {

    //push,pop, peek

    Node bottom;
    Node top;



    public boolean isEmpty(){

        return bottom == null;
    }


    public void push(int data){
        Node node = new Node(data);

        if (isEmpty()) bottom = top = node;
        else{
            node.next = top;
            top = node;
        }

    }

    public int pop(){

        int removedNode = -1;

        if(isEmpty()){
            System.err.println("Stack underFlow!");
        }else {
            removedNode = top.data;
            top = top.next;
        }

        return removedNode;
    }


    public int peek(){

        if (top == null) {
            System.err.println("Stack underFlow!");
        }else{
            return top.data;
        }

        return -1;
    }

    public static void main(String[] args) {

        StackLinkedList list = new StackLinkedList();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        list.push(a.data);
        list.push(b.data);
        list.push(c.data);

        System.out.println(list.pop());//30
        System.out.println(list.peek());//20


    }


}
