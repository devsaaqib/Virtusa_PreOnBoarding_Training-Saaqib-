public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread customer1 = new Thread(new Customer(account), "Customer-1");
        Thread customer2 = new Thread(new Customer(account), "Customer-2");

        ATM atm1 = new ATM(account, "ATM-1");
        ATM atm2 = new ATM(account, "ATM-2");

        customer1.start();
        customer2.start();
        atm1.start();
        atm2.start();
    }
}