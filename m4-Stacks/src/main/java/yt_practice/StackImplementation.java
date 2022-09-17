package yt_practice;


public class StackImplementation {

    public static void main(String[] args) {

        //creating stack
        Stack stack = new Stack(5);

        //adding
        stack.push("Vinit");
        stack.push(12);
        stack.push(3.14);
        stack.push(Boolean.TRUE);
        stack.push('V'); // top element

        //print the element of stack
        stack.show();

        //peek operation
        System.out.println("Top Element od stack : " +  stack.peek() );

        //pop operation :  delete top element of stack

        Object deletedElement = stack.pop();
        System.out.println("deletedElement = " + deletedElement);
        Object deletedElement2 = stack.pop();
        System.out.println("deletedElement2 = " + deletedElement2);

    }

}
