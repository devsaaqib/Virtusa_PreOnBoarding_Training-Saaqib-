class BankAccount {

    private int balance = 1000;

    public synchronized void deposit(int amount) {

        System.out.println(Thread.currentThread().getName() +
                " depositing: " + amount);

        balance += amount;

        System.out.println("Updated Balance after deposit: " + balance);

        notifyAll(); // Notify waiting ATM threads
    }

    public synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() +
                " trying to withdraw: " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance... Waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;

        System.out.println(Thread.currentThread().getName() +
                " completed withdrawal: " + amount);

        System.out.println("Updated Balance after withdrawal: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}