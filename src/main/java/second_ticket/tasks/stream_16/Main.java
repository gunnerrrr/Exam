package second_ticket.tasks.stream_16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Створити масив стрічок. Використовуючи stream.api,
//        видрукувати кількість стрічок, які починаються і
//        закінчуються однією літерою.
public class Main {
    public static void main(String[] args) {
        Integer [] arr= {229,9,5 ,323 ,123 ,5,320,99,339,11};
        int sum= Arrays.stream(arr).filter(p->p.toString().contains("9")).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
