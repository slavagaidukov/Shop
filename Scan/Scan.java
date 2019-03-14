package Scan;

import storage.ShopMessages;

import java.util.Scanner;
public class Scan {
    ShopMessages shopMessages;
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
                System.out.println(shopMessages.hashMap.get("digitError"));
            }
        }
        return number;
    }
}
