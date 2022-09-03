package com.swaraj;

public class EscapeCharacters {
    public static void main(String args[]){
        /*
        Escape characters are special characters that can be added in a string.(Mainly 4)
        -> ""
        -> \
        -> New Line
        -> Tab
         */

        // '\' is used to use double quotes and single back slash.
        String message1 = "Hello \"World\"";
        System.out.println(message1);

        String message2 = "C:\\Windows\\Users";
        System.out.println(message2);

        String message3 = "C:\nWindows\\Users";
        System.out.println(message3);

        String message4 = "C:\tWindows\\Users";
        System.out.println(message4);
    }
}
