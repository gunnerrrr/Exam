package third_ticket.date_13;

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

        Calendar calendar = new GregorianCalendar(year, month , day);
        calendar.add(Calendar.MONTH,1);
        System.out.println(calendar.getTime());
    }
}
