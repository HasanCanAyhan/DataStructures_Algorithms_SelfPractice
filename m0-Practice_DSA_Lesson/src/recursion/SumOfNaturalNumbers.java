package recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(sumOfNaturalNumbers(n, 0));

    }


    public static int sumOfNaturalNumbers(int input, int sum){

        if (input == 0){
            return sum;
        }

        sum += input;

        return sumOfNaturalNumbers(input-1, sum);


    }
}
