import java.util.*;

public class SunsetViews {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        //                 0  1  2  3  4  5  6  7 : index
        sunsetViews(buildings, "west").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        //{3, 5, 4, 4, 3, 1, 3, 2};
        // 0  1  2  3  4  5  6  7 : index

        Stack<Integer> stack = new Stack<>(); // stack to hold building indicies that can see sunset
        // this part is for East by default
        int i = 0;
        int step = 1;
        // this part is for west
        if (direction.equalsIgnoreCase("west")){

            i = buildings.length-1;
            step = -1;

        }

        while(i >= 0 && i < buildings.length) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;

        }
        //now I have a stack with the building indicies that can see sunset

        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);

        return new ArrayList<Integer>(stack);
    }


}

