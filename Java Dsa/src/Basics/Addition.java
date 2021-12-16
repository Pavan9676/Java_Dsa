package Basics;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner paw = new Scanner(System.in);
        int a ;
        int b ;
        System.out.println("Enter a number: ");
        a = paw.nextInt();
        System.out.println("Enter second number: ");
        b = paw.nextInt();

        System.out.println("The sum is equal to " + (a+b));

    }

}
