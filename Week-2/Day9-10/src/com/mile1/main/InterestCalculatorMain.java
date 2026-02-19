package com.mile1.main;

import java.util.Scanner;

import com.mile1.account.RDAccount;
import com.mile1.account.SBAccount;
import com.mile1.account.FDAccount;

public class InterestCalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMAIN MENU");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Account Type (Normal/NRI): ");
                    String type = sc.next();

                    SBAccount sb = new SBAccount(amt, type);
                    System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                    break;

                case 2:
                    System.out.print("Enter FD amount: ");
                    double fdAmt = sc.nextDouble();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    FDAccount fd = new FDAccount(fdAmt, days, age);
                    System.out.println("Interest gained: Rs. " + fd.calculateInterest());
                    break;

                case 3:
                    System.out.print("Enter monthly amount: ");
                    double mAmt = sc.nextDouble();
                    System.out.print("Enter months: ");
                    int months = sc.nextInt();
                    System.out.print("Enter age: ");
                    int rdAge = sc.nextInt();

                    RDAccount rd = new RDAccount(months,mAmt, rdAge);
                    System.out.println("Interest gained: Rs. " + rd.calculateInterest());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}