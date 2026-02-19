package com.mile1.account;

public class RDAccount extends Account {
    int months;
    double monthlyAmount;
    int age;

    public RDAccount(int months, double monthlyAmount, int age) {
        this.months = months;
        this.monthlyAmount = monthlyAmount;
        this.age = age;
    }

    @Override
    public double calculateInterest() {
        if (months == 6)
            intrestRate = (age >= 60) ? 8.00 : 7.50;
        else if(months == 9)
            intrestRate =  (age>=60) ? 8.25 : 7.75;
        else if (months == 12)
            intrestRate = (age >= 60) ? 8.50 : 8.00;
        else if (months == 15)
            intrestRate = (age >= 60) ?8.75:8.25;
        else if (months == 18)
            intrestRate = (age >= 60) ? 9.00 : 8.50;
        else if (months ==21)
            intrestRate = (age >= 60) ? 9.25:8.75;

        double totalAmount = monthlyAmount * months;
        return (totalAmount=intrestRate) / 100;
    }
}
