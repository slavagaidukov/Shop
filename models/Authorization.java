package models;

import storage.DataOfShop;
import storage.ShopMessages;

import java.util.Scanner;
public class Authorization {
    ShopMessages shopMessages;
    DataOfShop dataOfShop;
    public Authorization(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }
    public void addAdmin () {
        dataOfShop.listOfEmails.add("admin@slavashop.by");
    }

    public void registr() {
        System.out.println(shopMessages.hashMap.get("emailRegistration"));
            Scanner mailReg = new Scanner(System.in);
            String mail = mailReg.next();
            if (dataOfShop.listOfEmails.contains(mail)) {
                System.out.println(shopMessages.hashMap.get("emailExists"));
            } else {
                dataOfShop.listOfEmails.add(mail);
                System.out.println(shopMessages.hashMap.get("finishRegistration"));
            }
        return;
    }

    public void login() {
        System.out.println(shopMessages.hashMap.get("emailLogin"));
            Scanner mailLog = new Scanner(System.in);
            String mail = mailLog.next();
            if (dataOfShop.listOfEmails.contains(mail)) {
                System.out.println(shopMessages.hashMap.get("loginTrue"));
            } else {
                System.out.println(shopMessages.hashMap.get("loginFalse"));
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
