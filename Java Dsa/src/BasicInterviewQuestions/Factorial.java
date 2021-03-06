package BasicInterviewQuestions;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r;
        int num1 = s.nextInt();
        int result = rfact(num1);
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
    public static int rfact(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num*rfact(num-1);
        }
    }
}
