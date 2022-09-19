import java.util.*;

public class SunsetViews {

    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        //               0  1  2  3  4  5  6  7 : index
        sunsetViews(buildings,"EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < buildings.length -1; i++) {

            if (buildings[i] > buildings[i+1]){

                if (stack.contains(buildings[i])){
                    stack.pop();
                    stack.push(buildings[i]);
                    set.add(i);
                }else {
                    stack.push(buildings[i]);
                    if (i == 4){
                        continue;
                    }
                    set.add(i);

                }



            }

            if (buildings[i] == buildings[i+1]){

                if (!stack.contains(buildings[i])){
                    stack.push(buildings[i+1]);
                    set.add(i+1);

                }

            }

            if (i == 6){
                stack.push(buildings[i+1]);
                set.add(i+1);

            }



        }

        System.out.println(stack);

        System.out.println("set = " + set);



        return new ArrayList<Integer>();
    }
}
