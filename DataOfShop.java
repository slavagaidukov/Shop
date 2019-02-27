import java.util.ArrayList;

public class DataOfShop {
    ArrayList<String> listOfEmails = new ArrayList<String>();
    ArrayList<String> listOfGoods = new ArrayList<String>();

    public DataOfShop() {
    }

    public void addStandardGoods() {
        listOfGoods.add("Good 1 - 1.00 USD");
        listOfGoods.add("Good 2 - 2.00 USD");
        listOfGoods.add("Good 3 - 3.00 USD");
    }
}