package BasicInterviewQuestions;

import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(power(num1,num2));
    }
    static int power(int num1,int num2){
        int mul = 1;
        while(num2 > 0){
            mul = num1*mul;
            num2--;
        }
        return mul;
    }
}
