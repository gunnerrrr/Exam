package first_ticket.tasks.regex_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "121";

        Pattern pattern = Pattern.compile("(\\d)\\d+\\1");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
                System.out.println("Matches");
        }
    }

}
