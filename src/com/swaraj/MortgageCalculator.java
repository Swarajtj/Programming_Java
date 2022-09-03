package com.swaraj;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);

        // Principal
        System.out.print("Principal: ");
        int principal = sc.nextInt();

        //Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        // Time period
        System.out.print("Period(Years): ");
        byte years = sc.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //Mortgage calculation

        // Mortgage = P * {R[(1+R)^n] / [(1+R)^n] - 1}

//        double step1 = 1 + rate;
//        double step2 = Math.pow(step1,numberOfPayments);
//
//        double step3 = (rate * step2) / (step2 - 1);
//        double step4 = principal * step3;
//        OR

        double mortgage = principal
                         * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                         / (Math.pow(1+monthlyInterest, numberOfPayments) - 1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ formattedMortgage);
    }
}
