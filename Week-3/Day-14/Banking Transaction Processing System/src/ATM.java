class ATM extends Thread {

    private BankAccount account;

    ATM(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {

        for (int i = 0; i < 3; i++) {
            account.withdraw(800);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}