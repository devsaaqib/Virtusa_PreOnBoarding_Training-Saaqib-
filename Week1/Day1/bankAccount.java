class Bank{
    private double balance;

    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposited: "+amount);

    }
    void withdraw(double amount){
        if (amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn Amount: "+amount);
        }
        else {
            System.out.println("Insufficient Balance!!");
        }

    }
    double getBalance(){
        return balance;
    }


}

public class bankAccount {
    public static void main(String[] args) {

        Bank acc= new Bank();
        acc.deposit(10000);
        acc.withdraw(7000);
        acc.withdraw(5000);

        System.out.println("Current Balance: "+acc.getBalance());

    }
}