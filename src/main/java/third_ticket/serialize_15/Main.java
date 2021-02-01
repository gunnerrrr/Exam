package third_ticket.serialize_15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
        {
            Set<PersonSerialize> set = new TreeSet<>(PersonSerialize.comparator);

            PersonSerialize p = new PersonSerialize("Zam", new Date());
            PersonSerialize p1 = new PersonSerialize("Tom", new Date());
            set.add(p);
            set.add(p1);
            oos.writeObject(set);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

    class PersonSerialize implements Serializable {
    public static Comparator<PersonSerialize> comparator = Comparator.comparing(o -> o.date);
    private String name;
    private Date date;

    PersonSerialize(String n, Date d){
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