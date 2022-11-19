package recursion;

public class StringReversal_Recursion {


    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverseString(s));

    }

    public static String reverseString(String input){
        //What is the base case?

        if (input.equals(""))return "";
        //What is the smallest amount of work I can do in each iteration?
        //pick a single character
        return reverseString(input.substring(1)) + input.charAt(0);

    }

}
