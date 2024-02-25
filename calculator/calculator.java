package com.patel;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int ch;
        float n1, n2,res;

        System.out.println("##################### Calculator ##################");
        System.out.println("select your operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");

        System.out.println("Enter your choice");
        ch = dev.nextInt();
        if (ch >= 1 && ch <= 4) {
            System.out.println("Enter 1st number: ");
            n1 = dev.nextFloat();
            System.out.println("Enter 2st number: ");
            n2 = dev.nextFloat();

            switch (ch) {
                case 1:
                    res = add(n1, n2);
                    System.out.println("The addition of " + n1 + " + " + n2 + " = : " + res);
                    break;

                case 2:
                    res = sub(n1, n2);
                    System.out.println("The subtraction of " + n1 + " - " + n2 + " = : " + res);
                    break;

                case 3:
                    res = mul(n1, n2);
                    System.out.println("The Multiplication of " + n1 + " X " + n2 + " = : " + res);
                    break;

                case 4:
                    res = div(n1, n2);
                    System.out.println("The Division of " + n1 + " / " + n2 + " = : " + res);
                    break;
            }
        }
        else{
            System.out.println("choose correct option");
        }
    }
    public static float add(float n1,float n2){
        return n1+n2;
    }
    public static float sub(float n1,float n2){
        return n1-n2;
    }
    public static float mul(float n1,float n2){
        return n1*n2;
    }
    public static float div(float n1,float n2){
        return n1/n2;
    }
}
