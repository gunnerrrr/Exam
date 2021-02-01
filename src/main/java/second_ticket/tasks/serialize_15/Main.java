package second_ticket.tasks.serialize_15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("map.dat")))
        {
            Map <Integer, List<String>> map = new HashMap<>();
            map.put(0,Arrays.asList("mercedes","BMW","toyota"));
            map.put(1,Arrays.asList("apple","banana"));
            map.put(2,Arrays.asList("Max","Vlad"));

            oos.writeObject(map);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

