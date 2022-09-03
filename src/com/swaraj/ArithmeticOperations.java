package com.swaraj;

public class ArithmeticOperations {
    public static void main(String[] args) {
        byte sum = 1 + 2;
        byte diff = 2 - 1;
        byte divide = 5/2; // For whole numbers
        float div = (float)5 / (float)2; // For decimal points
        System.out.println("divide = "+ divide);
        System.out.println("div = "+ div);


        /* ***************************************************** */

        byte x = 1;
        byte y = x++; // First value is assigned then incremented.
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        byte z = ++x; // First value is incremented and then assigned.
        System.out.println("z = "+ z);

        // Compound or Augmented assignment operators.
        byte a = 12;
        a += 2; // += is a Compound assignment operator
        System.out.println("a = "+ a);

        /* ************************************************************************* */
        // Order of operations -- (), */, +-
        byte p = 8 + 2 * 3;
        System.out.println("p = "+ p);

        byte q = (8+2)*3;
        System.out.println("q = "+ q);
    }
}
