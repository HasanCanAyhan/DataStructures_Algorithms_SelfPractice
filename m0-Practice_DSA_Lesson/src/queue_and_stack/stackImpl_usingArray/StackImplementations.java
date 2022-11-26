package queue_and_stack.stackImpl_usingArray;

//https://youtu.be/ttCiKTNwfm8

public class StackImplementations {

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack<>(5);
        stack.push(5);
        stack.push(11);
        stack.push(13);
        stack.push(15);
        stack.push(17);
        //stack.push(18); stack over flow , bcs size 5

        stack.show();

        System.out.println("-----------------");

        System.out.println( "peek : " + stack.peek() );

        System.out.println("-----------------");

        System.out.println("pop : " + stack.pop());
        System.out.println( "peek : " + stack.peek() );
        System.out.println("pop : " + stack.pop());
        System.out.println( "peek : " + stack.peek() );
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        //System.out.println("pop : " + stack.pop()); // stack underFlow


    }


}
