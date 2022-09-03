package com.swaraj;

public class Casting {
    public static void main(String[] args) {

        // Implicit casting - Automatic conversion where smaller data type gets converted into larger data type.
        // In this example, from short -> int
        // byte -> short -> int -> long -> float -> double
        short x = 1;
        int y = x + 1;
        System.out.println("y = "+ y);

        double a = 1.1;
        double b = a + 1; // 1 is implicitly cast into 1.0
        System.out.println("b = "+ b);

        // Explicit casting - Manual conversion where we convert a data type according to our preference.
        double c = 1.1;
        // If we want the result in int data type only.
        int d = (int)a + 2;
        System.out.println("d = "+ d);

        // Wrapper Classes - for data types which are not compatible like String and integers.
        // Use - In desktop or mobile applications, we get input in the form of String and if necessary
        // we need to convert it into a specific data type.
        String p = "1";
        int q = Integer.parseInt(p) + 3; // Integer is the wrapper class for the int primitive type.
        System.out.println("q = "+ q);

        String r = "1.1";
        double s = Double.parseDouble(r) + 3; // Integer is the wrapper class for the int primitive type.
        System.out.println("s = "+ s);

    }
}
