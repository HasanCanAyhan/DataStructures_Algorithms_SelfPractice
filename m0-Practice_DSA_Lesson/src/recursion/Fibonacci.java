package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 7;

        System.out.println(fibonacciNum(n));
    }

    static int fibonacciNum(int n){

        if (n < 2){
            return n;
        }

        return (fibonacciNum(n-1) + fibonacciNum( n-2));
    }

}
