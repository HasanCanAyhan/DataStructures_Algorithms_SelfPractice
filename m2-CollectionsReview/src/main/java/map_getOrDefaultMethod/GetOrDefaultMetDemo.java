package map_getOrDefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMetDemo {

    public static void main(String[] args) {

        Map<Integer, String> empMap = new HashMap<>();

        empMap.put(1,"Martin");
        empMap.put(2,"Frank");
        empMap.put(3,"Andrew");


        String result = empMap.getOrDefault(4,"Rocky");
        System.out.println(result);

        System.out.println("---------------------------------------------------");

        empMap.forEach((k, v) -> System.out.println(k + " : " + v ));

    }


}
