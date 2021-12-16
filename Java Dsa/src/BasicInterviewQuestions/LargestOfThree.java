package BasicInterviewQuestions;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println(maxOf3(num1,num2,num3));
    }
    static int maxOf3(int num1, int num2, int num3){
        if(num1 < num2 && num2 > num3){
            return num2;
        }
        else if(num1 > num2 && num1 > num3){
            return num1;
        }
        else{
            return num3;
        }
    }
}
