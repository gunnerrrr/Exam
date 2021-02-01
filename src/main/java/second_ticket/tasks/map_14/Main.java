package second_ticket.tasks.map_14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <Integer, List<String>> map = new HashMap<>();
        map.put(0,Arrays.asList("mercedes","BMW","toyota"));
        map.put(1,Arrays.asList("apple","banana"));
        map.put(2,Arrays.asList("Max","Vlad"));

        System.out.println(map.get(2).get(map.get(2).size()-1));

    }


}
