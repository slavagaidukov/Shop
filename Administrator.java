import java.util.Scanner;

public class Administrator {
    public DataOfShop dataOfShop;

    public Administrator(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }

    public void adminLog() {
        System.out.println("Please, type your e-mail.");
        Scanner admSc = new Scanner(System.in);
        String adminEmail = admSc.next();
        if (dataOfShop.listOfEmails.contains(adminEmail)) {
            System.out.println("Press '1' to output list of e-mails which were registered,'2' to output list of goods, '3' to add a new good which were registered or type the other number to go back.");
            Scanner admOutput = new Scanner(System.in);
            int adminOutput = admOutput.nextInt();
            switch (adminOutput) {
                case 1 : for (String a : dataOfShop.listOfEmails)
                    System.out.println(a);
                    break;
                case 2 : for (String a : dataOfShop.listOfGoods)
                    System.out.println(a);
                    break;
                case 3 :
                    System.out.println("Please, input the good and its price");
                    Scanner newPrice = new Scanner(System.in);
                    String price = newPrice.nextLine();
                    dataOfShop.listOfGoods.add(price);
                    break;
                case 9 : break;
            }
        }
        else {
            System.out.println("Incorrect e-mail.");
        }
    }
    }


