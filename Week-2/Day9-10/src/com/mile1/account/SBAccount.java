package com.mile1.account;

public class SBAccount extends Account{
    String accountType;
    double amount;

    public SBAccount(double amount,String accountType) {
        this.amount=amount;
        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() {
        if (accountType.equalsIgnoreCase("Normal")){
            intrestRate=4;
        }
        else if(accountType.equalsIgnoreCase("NRI")){
            intrestRate=6;
        }
        return (amount*intrestRate)/100;
    }
}
