package com.mile1.account;

public class SBAccount extends Account{
    String accountType;

    public SBAccount(int amount,String accountType) {
        this.amount=amount;
        this.accountType = accountType;
    }

    @Override
    public double calculateIntrest() {
        if (accountType.equalsIgnoreCase("Normal")){
            intrestRate=4;
        }
        else if(accountType.equalsIgnoreCase("NRI")){
            intrestRate=6;
        }
        return (amount*intrestRate)/100;
    }
}
