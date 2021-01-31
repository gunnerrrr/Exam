package first_ticket.threads_17;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String text = "wlefwf sdfnslkf lflekmfslkc lskd cc sldkc sldclsdcl l";
                String[] words=text.split(" ");
        Thread t1 = new Thread();
        t1.start();

        for(int i=0;i<words.length;i++) {
            if(i%2==0) {
               System.out.println(words[i]);
               Thread.sleep(10000);
            }
        }
        Thread t2 = new Thread();
        t2.start();
        for(int i=0;i<words.length;i++) {
            if(i%2==1) {
                System.out.println(words[i]);
            }
        }
    }
}
