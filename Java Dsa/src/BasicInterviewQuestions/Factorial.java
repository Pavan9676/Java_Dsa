package BasicInterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int result = fact(num1);
        System.out.println((result));
    }

    public static int fact(int num1) {
        int temp = 1;
        while(num1 > 1){
            temp*=num1;
            num1-=1;
        }
        return temp;
    }
}
