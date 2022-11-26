package queue_and_stack;

import java.util.Stack;

public class StringIsValid {


    public static void main(String[] args) {


        String s = "()";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {

                //if (stack.isEmpty()) return false;

                char peek = stack.peek();
                if(ch == ')' && peek != '(') return false;
                else if (ch == ']' && peek != '[') return false;
                else if (ch == '}' && peek != '{') return false;
                else stack.pop();
            }

        }

        return stack.isEmpty();




    }

}
