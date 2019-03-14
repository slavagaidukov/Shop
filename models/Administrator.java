package models;

import storage.DataOfShop;
import storage.ShopMessages;

import java.util.Scanner;

public class Administrator {
    DataOfShop dataOfShop;
    ShopMessages shopMessages;
    public Administrator(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }

    public void adminLog() {
        System.out.println(shopMessages.hashMap.get("emailAdmin"));
        Scanner admSc = new Scanner(System.in);
        String adminEmail = admSc.next();
        if (dataOfShop.listOfEmails.contains(adminEmail)) {
            System.out.println(shopMessages.hashMap.get("adminLogged"));
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
            System.out.println(shopMessages.hashMap.get("emailAdminError"));
        }
    }
    }


