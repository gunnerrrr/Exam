package first_ticket.tasks.file_16;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        List<String> sentences = new ArrayList<>();
        try {
            inputStream = new BufferedReader(new FileReader("d:\\first.txt"));
            outputStream = new PrintWriter(new FileWriter("d:\\second.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                sentences.add(l);
                String delimiterForWords=" ";
                outputStream.println(l.split(delimiterForWords)[0]);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
