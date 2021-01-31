package first_ticket.tasks.serialize_15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
        {
            Set<Person> set = new TreeSet<>(Person.comparator);

            Person p = new Person("Zam", new Date());
            Person p1 = new Person("Tom", new Date());
            set.add(p);
            set.add(p1);
            oos.writeObject(set);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

class Person implements Serializable {
    public static Comparator<Person> comparator = Comparator.comparing(o -> o.name);
    private String name;
    private Date date;

    Person(String n, Date d){
        name=n;
        date=d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}