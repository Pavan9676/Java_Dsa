package Basics;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        System.out.println(ch);
        System.out.println((int)'a');

       for(int i = 'A'; i <= 'Z'; i++){
            System.out.println((char)i);
        }

    }
}
