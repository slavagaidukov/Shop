package program;
import Scan.Scan;
import models.Authorization;
import models.Administrator;
import storage.DataOfShop;
import storage.ShopMessages;
public class Main {
    public static void main(String[] args) {
        DataOfShop data = new DataOfShop();
        Authorization reg = new Authorization(data);
        Administrator admin = new Administrator(data);
        ShopMessages shopMessages = new ShopMessages();
        shopMessages.map();
        Scan sc = new Scan();
        data.addStandardGoods();
        reg.addAdmin();
        System.out.println(shopMessages.hashMap.get("welcome"));
        int number = sc.scan();
        while (number != 9) {
            switch (number) {
                case 1:
                    reg.registr();
                    break;
                case 2:
                    reg.login();
                    break;
                case 3:
                    admin.adminLog();
                    break;
                default:
                    System.out.println("Please, type correct number.");
            }
            System.out.println(shopMessages.hashMap.get("welcome"));
            number=sc.scan();
        }
        if (number==9) {
            System.out.println("Thank you for visiting our site.");
        }
    }
}