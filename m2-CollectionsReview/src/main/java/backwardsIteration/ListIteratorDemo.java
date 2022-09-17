package backwardsIteration;

//https://youtu.be/ViMQTO6Z4so

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("def");
        names.add("ghj");
        names.add("klm");

        System.out.println("Original List : " + names);

        //Forward Iteration
        ListIterator<String> listIterator = names.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("------------------------------------------------");
        // Backwards Iteration

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        System.out.println("-------------------------------------------");

        //nextIndex
        while (listIterator.hasNext()){

            if (listIterator.next().equals("ghj")){
                System.out.println(listIterator.nextIndex()); // 3 -->> klm
            }

        }

        System.out.println("-------------------------------------------");
        //previousIndex

        while (listIterator.hasPrevious()){

            if (listIterator.previous().equals("klm")){
                System.out.println(listIterator.previousIndex()); //2 --->> ghj
            }

        }

        System.out.println("-------------------------------------------");
        //add element

        while (listIterator.hasNext()){

            if (listIterator.next().equals("klm")){
                listIterator.add("temp");
            }

        }

        System.out.println("original list = " + names);


    }


}
