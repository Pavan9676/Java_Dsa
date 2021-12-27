package BasicInterviewQuestions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int h = Math.max(num1,num2);
        while(true){
            if (num1%h == 0 && num2%h ==0){
                System.out.println(h);
                break;
            }
            else{
                h--;
            }

        }
    }

}
