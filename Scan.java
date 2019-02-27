import java.util.Scanner;
public class Scan {
    public int scan () {
        Scanner num = new Scanner(System.in);
        String input ="";
        int number = 0;
        boolean isNumber = false;


        while (isNumber==false) {
            try {
                input = num.next();
                number = Integer.parseInt(input);
                isNumber = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Error. Please, input the digit.");
            }
        }
        return number;
    }
}
