package third_ticket.regex_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "GFD";

        Pattern pattern = Pattern.compile("^[A-Z]{1,3}$");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
                System.out.println("Matches");
        }
    }

}
