package com.swaraj;
import java.awt.*;
import java.util.Date;

public class DataTypes {
    public static void main(String args[]){
        byte age = 30; // -> [-128,127]
        short steps = 1000; // -> [-32K,32K]

        // Use underscore as comma to separate large numbers.
        int subscriberCount = 123_456_789; // -> [-2B,2B]

        // By default, Java reads number as integer, to make it long use 'L' after the number.
        long viewCount = 3_123_456_789L;

        // By default, Java reads decimals as double, to make it float use 'F' after the number.
        float price = 99.99F;

        char letters = 'A';
        boolean isTrue = false;

        //************************************************************************************

        // Reference Type - Memory allocation (new keyword needs to be done)
        Date now = new Date();
        //System.out.println(now);

        // Difference between primitive and reference data types.

        //STORED BY REFERENCE
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point1);


        //STORED BY VALUE
        byte num1 = 2;
        byte num2 = num1;
        num1 = 5;
        System.out.println(num2);

        /* ********************************************************************************** */
        String message = "  Hello World "; // String is a reference Data type & IMMUTABLE.
        String message2 = "!!";
        System.out.println(message.concat(message2));
        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("World","Java"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        //System.out.println(message);

        /* ****************************************************************************** */




    }
}
