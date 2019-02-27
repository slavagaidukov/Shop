import java.util.Scanner;
public class Authorization {
    DataOfShop dataOfShop;
    public Authorization(DataOfShop dataOfShop) {
        this.dataOfShop = dataOfShop;
    }

    public void welcome () {
        System.out.println("Welcome to slavashop.by!\nPlease, press '1' to create an account, '2' to log in, '3' to log in as an administrator or '9' to exit.");
    }
    public void addAdmin () {
        dataOfShop.listOfEmails.add("admin@slavashop.by");
    }

    public void registr() {
        System.out.println("Dear buyer, please, enter your e-mail to register on the site.");
        System.out.println("Please enter your e-mail.");
            Scanner mailReg = new Scanner(System.in);
            String mail = mailReg.next();
            if (dataOfShop.listOfEmails.contains(mail)) {
                System.out.println("Entered e-mail is already exists - please, enter another e-mail");
            } else {
                dataOfShop.listOfEmails.add(mail);
                System.out.println("Registration is finished. Thank you!");
            }
        return;
    }

    public void login() {
        System.out.println("Please enter your e-mail.");
            Scanner mailLog = new Scanner(System.in);
            String mail = mailLog.next();
            if (dataOfShop.listOfEmails.contains(mail)) {
                System.out.println("You are logged in. Thank you! If you want to see the price of goods, please type '1', '2' - to buy the good or the other number to go back.");
            } else {
                System.out.println("There is no user with this e-mail. Please, try again or type '9' to go back.");
            }

            Scanner outputGoods = new Scanner(System.in);
            switch (outputGoods.nextInt()) {
                case 1:
                    for (String a : dataOfShop.listOfGoods) {
                        System.out.println(a);
                    }
                    break;
                case 2:
                    for (String a : dataOfShop.listOfGoods) {
                        System.out.println(a);
                    }
                    System.out.println("Choose the number of good that you want to buy");
                    Scanner buyGood = new Scanner(System.in);
                    int numOfGood = buyGood.nextInt();
                    System.out.println("You have bought " + dataOfShop.listOfGoods.get(numOfGood - 1));
                    break;
                default:
                    break;
            }
            }
        }
