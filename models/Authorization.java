package models;

import messages.MessageKeys;
import storage.DataOfShop;
import messages.ShopMessages;

import java.util.Scanner;
public class Authorization {
    DataOfShop dataOfShop;
    public Authorization(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }
    public void addAdmin () {
        dataOfShop.getListOfEmails().add("admin@slavashop.by");
    }

    public void registr() {
        System.out.println(ShopMessages.getMessage(MessageKeys.EMAILREGISTRATION));
            Scanner mailReg = new Scanner(System.in);
            String mail = mailReg.next();
            if (dataOfShop.getListOfEmails().contains(mail)) {
                System.out.println(ShopMessages.getMessage(MessageKeys.EMAILEXISTS));
            } else {
                dataOfShop.getListOfEmails().add(mail);
                System.out.println(ShopMessages.getMessage(MessageKeys.FINISHREGISTRATION));
            }
        return;
    }

    public void login() {
        System.out.println(ShopMessages.getMessage(MessageKeys.EMAILLOGIN));
            Scanner mailLog = new Scanner(System.in);
            String mail = mailLog.next();
            if (dataOfShop.getListOfEmails().contains(mail)) {
                System.out.println(ShopMessages.getMessage(MessageKeys.LOGINTRUE));
            } else {
                System.out.println(ShopMessages.getMessage(MessageKeys.LOGINFALSE));
            }

            Scanner outputGoods = new Scanner(System.in);
            switch (outputGoods.nextInt()) {
                case 1:
                    dataOfShop.showListOfGoods();
                    break;
                case 2:
                    dataOfShop.startPurchase();
                    break;
                default:
                    break;
            }
            }
        }
