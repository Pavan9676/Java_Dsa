package BasicInterviewQuestions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        //swap(num1,num2);
        swap1(num1,num2);

    }
    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
    static void swap1(int num1,int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1+" "+num2);
    }
}
