package first_ticket.tasks.threads_17;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String text = "wlefwf sdfnslkf lflekmfslkc lskd cc sldkc sldclsdcl l";
                String[] words=text.split(" ");
         new Thread(()-> {
             for(int i=0;i<words.length;i++) {
                 if(i%2==0) {
                     try {
                         Thread.sleep(10000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     System.out.println(words[i]);
                 }
             }
        }).start();


        new Thread(()-> {
            for(int i=0;i<words.length;i++) {
                    if(i%2==1) {
                        System.out.println(words[i]);
                    }
            }
        }).start();

    }
}
