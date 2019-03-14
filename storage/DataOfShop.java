package storage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DataOfShop {
    ShopMessages shopMessages;
    public Set<String> listOfEmails = new HashSet<>();
    ArrayList<String> listOfGoods = new ArrayList<>();

    public DataOfShop() {
    }

    public void startPurchase () {
        for (String a : listOfGoods) {
            System.out.println(a);
        }
        System.out.println(shopMessages.hashMap.get("choiceOfGood"));
        Scanner buyGood = new Scanner(System.in);
        int numOfGood = buyGood.nextInt();
        System.out.println("You have bought " + listOfGoods.get(numOfGood - 1));
    }

    public void addNewGood () {
        System.out.println(shopMessages.hashMap.get("newGood"));
        Scanner newPrice = new Scanner(System.in);
        String price = newPrice.nextLine();
        listOfGoods.add(price);

    }

    public void showListOfEmails () {
        for (String a : listOfEmails) {
            System.out.println(a);
        }
    }

    public void showListOfGoods () {
        for (String a : listOfGoods) {
            System.out.println(a);
        }
    }

    public void addStandardGoods() {
        listOfGoods.add("Good 1 - 1.00 USD");
        listOfGoods.add("Good 2 - 2.00 USD");
        listOfGoods.add("Good 3 - 3.00 USD");
    }
}