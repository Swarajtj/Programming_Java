package com.swaraj;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Age: ");
        byte age = sc.nextByte();
        System.out.println("You are "+ age);
         */

        System.out.print("Name: ");
        String name = sc.nextLine().trim();// To remove the white spaces before and after the input
        System.out.println("You are "+ name);



    }
}
