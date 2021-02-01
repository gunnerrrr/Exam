package second_ticket.tasks.threads_17;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int size = 10;
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-1, 5+1);
                System.out.print(matrix[i][j]+"      \t");
            }
        }

        new Thread(() -> {
            double firstSum = 0;
            for (int i = 0; i < size; i++) {
                if (!Thread.currentThread().isInterrupted()) {
                    if (matrix[i][i] >= 0)
                        firstSum += matrix[i][i];
                    else {
                        System.out.println("position is [" + i + "][" + i + "]");
                        Thread.currentThread().interrupt();
                    }
                }
            }
            System.out.println(firstSum);
        }).start();


        new Thread(() -> {
            double secondSum = 0;

            for (int i = 0; i < size; i++) {
                if (!Thread.currentThread().isInterrupted()) {
                    if (matrix[i][size - i - 1] >= 0)
                        secondSum += matrix[i][size - i - 1];
                    else {
                        System.out.println("position is [" + i + "][" + (size - i - 1) + "]");
                        Thread.currentThread().interrupt();
                    }
                }
            }
            System.out.println(secondSum);
        }).start();

    }
}
