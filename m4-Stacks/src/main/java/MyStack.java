import java.util.NoSuchElementException;

public class MyStack<T> {

    public SNode<T> bottom; // head
    public SNode<T> top; // tail
    int size;

    public boolean isEmpty(){

        return bottom == null;

    }


    //push operation

    public void push(T item){
        SNode<T> node = new SNode<>(item);

        if (isEmpty()) bottom = top = node;
        else{
            top.next = node;
            top = node;
        }

        size++;
    }


    public T peek(){
        return (T) top.value;
    }

    public T pop(){
        SNode peekNode;

        if (isEmpty()) throw new NoSuchElementException();

        //1 case : stack has single/one element

        if (top == bottom) {
            peekNode = top;
            top = bottom= null;

        }else{ //2 case more than one item

            peekNode = top;
            SNode previous = bottom;
            while (previous.next != top){ // to find previous SNode
                previous = previous.next;
            }
            previous.next = null;
            top = previous;
            size--;


        }

        return (T) peekNode.value;




    }



}
