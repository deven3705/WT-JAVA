package com.patel;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Declare a variable to store the number.
        int number;

        // Read the input number.
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = obj.nextInt();

        // Determine whether the number is even or odd.
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
