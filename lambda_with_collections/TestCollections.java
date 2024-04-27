package lambda_with_collections;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Arjuna");
        list.add("Arjuna");
        list.add("Bheema");
        list.add("Yudhistira");
        list.add("Nakula");
        list.add("Sahadeva");


        // using lambda to iterate through list
        list.forEach((n) -> System.out.println(n));

        System.out.println("=====================================");

        // Set: no duplicates

        Set<String> set = new HashSet<>();
        set.add("Arjuna");
        set.add("Arjuna");
        set.add("Bheema");
        set.add("Yudhistira");
        set.add("Nakula");
        set.add("Sahadeva");

        set.forEach((n) -> System.out.println(n));

        System.out.println("=====================================");

        // Map: key-value pair

        Map<Integer, String> yuga = new HashMap<>();
        yuga.put(1, "Satya Yuga");
        yuga.put(2, "Treta Yuga");
        yuga.put(3, "Dwapara Yuga");
        yuga.put(4, "Kali Yuga");

        yuga.forEach((key, value) -> System.out.println(key + " : " + value));

    }

}
