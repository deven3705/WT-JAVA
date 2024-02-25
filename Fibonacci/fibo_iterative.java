package com.patel;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int size,next;
        int a = 0, b = 1;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number to print fibo series: ");
        size = obj.nextInt();

        if(size==0){
            System.out.println("Enter size greater than 0");
        }
        else if(size==1){
            System.out.println(a);
        }
        else if(size==2){
            System.out.println(a + " " + b);
        }
        else{
            System.out.print(a + " " + b);
            for (int i = 0; i < size-2; i++) {
                next = a+b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
    }
}
