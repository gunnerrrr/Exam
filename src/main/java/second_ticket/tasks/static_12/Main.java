package second_ticket.tasks.static_12;

public class Main {
    private static int [] CountAndMultiplyOfDigit (Integer number) {
        String strNumber = number.toString();
        int firstDigit=Character.getNumericValue(strNumber.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(strNumber);
        sb.reverse();
        strNumber = sb.toString();
        int num=Integer.parseInt(strNumber);
        for(int i=0;i<strNumber.length();i++)  {
        }
       return new int[] {num,firstDigit};
    }
    public static void main(String[] args) {
        int[]a=(CountAndMultiplyOfDigit(415));
        for(int aa:a) {
            System.out.println(aa);
        }
    }
}
