package com.swaraj;

import java.text.NumberFormat;

public class FormatNumbers {
    public static void main(String[] args) {

        // Currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println("Result = "+ result);

        //Percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.1);
        System.out.println("Percentage = "+ percentage);

        //Concise method
        String percentage2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("Percentage2 = "+ percentage2);
    }

}
