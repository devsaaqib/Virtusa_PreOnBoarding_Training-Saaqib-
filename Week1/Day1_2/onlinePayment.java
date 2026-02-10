interface Payment{
    void pay(double amount);
}

class UPI implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Payment of Amount "+ amount +" is done using UPI");
    }
}
class creditCard implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Payment of Amount "+ amount +" is done using Credit Card");
    }
}

class NetBanking implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Payment of Amount "+ amount +" is done using NetBanking");
    }
}

public class onlinePayment {
    public static void main(String[] args) {
        Payment p1= new UPI();
        Payment p2= new creditCard();
        Payment p3= new NetBanking();

        p1.pay(1000);
        p2.pay(300);
        p3.pay(4000);
    }
}