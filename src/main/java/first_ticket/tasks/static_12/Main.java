package first_ticket.tasks.static_12;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int [] CountAndMultiplyOfDigit (Integer number) {
        String strNumber = number.toString();
        int mult=1;

        for(int i=0;i<strNumber.length();i++)  {
            mult*= Character.getNumericValue(strNumber.charAt(i));
        }
       return new int[] {mult,strNumber.length()};
    }
    public static void main(String[] args) {
        int[]a=(CountAndMultiplyOfDigit(415));
        for(int aa:a) {
            System.out.println(aa);
        }
    }
}
