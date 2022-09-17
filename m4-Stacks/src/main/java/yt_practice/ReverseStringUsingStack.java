package yt_practice;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String str = "Hello world";

        System.out.println(reverse(str));

    }


    private static String reverse(String input){

        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();

        for (char ch : chars) {
            stack.push(ch);
        }

        String result = "";

        for (int i = 0; i < chars.length ; i++) {
            //chars[i] = stack.pop(); // d,l,r,o,w ,o,l,l,e,h
            result += stack.pop();
        }

        //return new String(chars);
        return result;
    }

}
