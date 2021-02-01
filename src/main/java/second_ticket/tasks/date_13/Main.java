package second_ticket.tasks.date_13;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Day: ");
        int day = in.nextInt();
        System.out.print("Month: ");
        int month = in.nextInt();
        System.out.print("Year: ");
        int year = in.nextInt();
        Calendar calendar = new GregorianCalendar(year,month,day);
        Date date = calendar.getTime();
        Date date2=new Date();
        if(date.before(date2)) {
            System.out.println("input date is earlier");
        }
        if(date.after(date2)) {
            System.out.println("input date is later");
        }
        if(date.getTime()==date2.getTime()) {
            System.out.println("equals");
        }
    }
}
