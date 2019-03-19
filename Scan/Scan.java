package scan;

import messages.MessageKeys;
import messages.ShopMessages;

import java.util.Scanner;
public class Scan {
    public int scan () {
        Scanner num = new Scanner(System.in);
        String input ="";
        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                input = num.next();
                number = Integer.parseInt(input);
                isNumber = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println(ShopMessages.getMessage(MessageKeys.DIGITERROR));
            }
        }
        return number;
    }
}
