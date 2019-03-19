package models;

import messages.MessageKeys;
import storage.DataOfShop;
import messages.ShopMessages;

import java.util.Scanner;

public class Administrator {
    DataOfShop dataOfShop;
    public Administrator(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }

    public void adminLog() {
        System.out.println(ShopMessages.getMessage(MessageKeys.EMAILADMIN));
        Scanner admSc = new Scanner(System.in);
        String adminEmail = admSc.next();
        if (dataOfShop.getListOfEmails().contains(adminEmail)) {
            System.out.println(ShopMessages.getMessage(MessageKeys.ADMINLOGGED));
            Scanner admOutput = new Scanner(System.in);
            int adminOutput = admOutput.nextInt();
            switch (adminOutput) {
                case 1 : dataOfShop.showListOfEmails();
                    break;
                case 2 : dataOfShop.showListOfGoods();
                    break;
                case 3 : dataOfShop.addNewGood();
                    break;
                case 9 : break;
            }
        }
        else {
            System.out.println(ShopMessages.getMessage(MessageKeys.EMAILADMINERROR));
        }
    }
    }


