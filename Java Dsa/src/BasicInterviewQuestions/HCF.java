package BasicInterviewQuestions;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(hcf(num1,num2));
    }
    static int hcf(int num1, int num2){
        int h = Math.min(num1,num2);
        if (num1 ==0 || num2 ==0){
            return Math.max(num1,num2);
        }
        while(true){
            if (num1%h == 0 && num2%h ==0){
                return h;
            }
            else{
                h--;
            }

        }
    }
}
