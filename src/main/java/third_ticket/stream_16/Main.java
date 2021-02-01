package third_ticket.stream_16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] arr= {"OHello", "My","Friend", "Darkness","Old", "My"};
        long count= Arrays.stream(arr)
                .filter(p->p.toLowerCase().charAt(0)==p.toLowerCase().charAt(p.length()-1))
                .count();
        System.out.println(count);
    }
}
