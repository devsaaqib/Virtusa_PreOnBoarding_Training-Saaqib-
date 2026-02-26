class Customer implements Runnable {

    private BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {

        for (int i = 0; i < 3; i++) {
            account.deposit(500);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}