package recursion;

public class DecimalToBinary_Recursion {

    public static void main(String[] args) {

        int input = 233;
        System.out.println(decimalToBinary(input,""));
    }

    public static String decimalToBinary(int decimal,String result){

        if (decimal == 0){
            return result;
        }

        result = decimal %2 + result;

        return decimalToBinary(decimal/2,result);

    }

}
