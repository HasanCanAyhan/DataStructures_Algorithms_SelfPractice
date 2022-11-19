package recursion;

public class Palindrome_Recursive {

    public static void main(String[] args) {

        String s = "racecar";
        System.out.println(isPalindrome(s));
    }


    public static boolean isPalindrome(String input){

        if (input.equals("") || input.length() == 1){
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1,input.length()-1));
        }

        return false;
    }

}
