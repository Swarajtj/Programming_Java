package com.swaraj;

public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println("result = "+ result);

        double r1 = Math.ceil(2.2);
        //OR
        int r2 = (int)Math.ceil(2.2);
        System.out.println("r1 = "+ r1);
        System.out.println("r2 = "+ r2);

        int r3 = (int)Math.floor(2.2);
        System.out.println("r3 = "+ r3);

        int r4 = (int)Math.max(2,3);
        System.out.println("r4 = "+ r4);
        int r5 = (int)Math.min(2,3);
        System.out.println("r5 = "+ r5);

        /* ************************************************************ */
        //Random Numbers
        double result2 = Math.random(); // Random number between 0-1
        System.out.println("result2 = "+ result2);

        double result3 = Math.random() * 100; // Random number between 0-100
        System.out.println("result3 = "+ result3);

        // Two methods to get rid of the values after the decimal points
        // 1. Math.round()
        // 2. Casting

        double result4 = Math.round(Math.random() * 100); // Random number between 0-100
        System.out.println("result4 = "+ result4);

        int result5 = (int)Math.round(Math.random() * 100); // Random number between 0-100
        System.out.println("result5 = "+ result5);
        // OR
        int result6 = (int)(Math.random() * 100); // Parenthesis needed around Math.random() or else casting only effects the random method and output will be zero.
        System.out.println("result6 = "+ result6);






    }
}
