 public class Main {
    public static void main(String[] args) {
        DataOfShop data = new DataOfShop();
        Authorization reg = new Authorization(data);
        Administrator admin = new Administrator(data);
        Scan sc = new Scan();
        data.addStandardGoods();
        reg.addAdmin();
        reg.welcome();
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
            reg.welcome();
            number=sc.scan();
        }
        if (number==9) {
            System.out.println("Thank you for visiting our site.");
        }
    }
}