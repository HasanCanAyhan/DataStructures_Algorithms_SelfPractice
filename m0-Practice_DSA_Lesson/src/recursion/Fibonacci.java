package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int answer = fibonacciNum(4);
        System.out.println(fibonacciNum(answer));

    }

    static int fibonacciNum(int n){

        if (n < 2){
            return n;
        }

        if (n == 2) return 1;

        return fibonacciNum(n-1) + fibonacciNum( n-2);
    }

}
