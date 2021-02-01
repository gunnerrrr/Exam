package third_ticket.map_14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map <Integer, List<String>> map = new HashMap<>();
        map.put(0,Arrays.asList("mercedes","BMW","toyota"));
        map.put(1,Arrays.asList("apple","banana"));
        map.put(2,Arrays.asList("Max","Vlad"));
        Collections.sort(map.get(0));
        System.out.println(map.get(0));

    }


}
