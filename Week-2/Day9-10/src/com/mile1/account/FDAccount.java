package com.mile1.account;

public class FDAccount extends Account{
    int noOfDays;
    int age;
    double amount;

    public FDAccount(double amount, int noOfDays, int age) {
        this.noOfDays = noOfDays;
        this.age = age;
        this.amount=amount;
    }

    @Override
    public double calculateInterest() {
        if (amount > 10000000){
            if (noOfDays>=7 && noOfDays<=14)
                intrestRate= (age>=60) ?5.00 : 4.50;
        } else if (noOfDays <=29) {
            intrestRate = (age >= 60) ? 5.25 : 4.75;

        }
        else if (noOfDays <=45) {
            intrestRate = (age >= 60) ?  6.00: 5.50;

        }
        else if (noOfDays <=60) {
            intrestRate = (age >= 60) ?  7.50: 7.00;

        }
        else if (noOfDays <=184) {
            intrestRate = (age >= 60) ?  8.00: 7.50;

        }
        else if (noOfDays <=365) {
            intrestRate = (age >= 60) ?  8.50: 8.00;

        }
        else {
            if(noOfDays<=14) intrestRate=6.50;
            else if (noOfDays<=29) intrestRate=6.75;
            else if (noOfDays<= 45) intrestRate= 6.75;
            else if (noOfDays<=60 ) intrestRate= 8.00;
            else if (noOfDays<= 184) intrestRate= 8.50;
            else if (noOfDays<= 365) intrestRate= 10.00;
        }

        return (amount*intrestRate) / 100 ;
    }
}
