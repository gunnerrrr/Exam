package second_ticket.tasks.threads_17;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int size =10;
        double [][]matrix= new double[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                matrix[i][j]= Math.random()*200 - 100;
                System.out.println(matrix[i][j]);
            }
        }
         new Thread(()-> {
                 double firstSum=0;
                 while (!Thread.currentThread().isInterrupted()) {
                         for (int i = 0; i < size; i++) {
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


        new Thread(()-> {
            double secondSum=0;
            for(int i=0;i<size;i++) {
                if(matrix[i][size-i-1]>=0)
                    secondSum+=matrix[i][size-i-1];
                else {
//                    System.out.println("position is ["+i+"]["+i+"]");
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

    }
}
