package queue_and_stack;

import java.util.Stack;

public class Next_Greater_Element {

    public static void main(String[] args) {

        int[] arr = {4,5,2,25};

        next_greater(arr, arr.length);
    }


    public static void  next_greater(int[] arr, int n){

        Stack<Integer> s = new Stack<>();
        
        int[] arr1 = new int[n];

        //iterating the arr from end
        for (int i = n-1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if (s.isEmpty()){
                arr1[i] = -1;//it is pushing from the end : _ _ _ -1;
            }else {
                arr1[i] = s.peek();
            }

            s.push(arr[i]);

        }


        for (int i = 0; i < n ; i++) {
            System.out.println(arr1[i]);
        }
        
    }




}
