package BasicInterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //System.out.println(Sum(num));
        //System.out.println(Count(num));
        //System.out.println(MulDigit(num));
        //System.out.println(Reverse(num));
        //System.out.println(isPalindrome(num));
        System.out.println(isAmstrong(num));
        for(int i = 0; i<num; i++){
            if(isAmstrong(i)){
                System.out.println(i + " ");
            }
//            System.out.println(isAmstrong(i));
        }
    }
    static int Sum(int num){
        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum +=temp;
            num = num/10;
        }
        return sum;
    }
    static int Count(int num1){
        int count = 0;
        while(num1 > 0){
            count++;
            num1 = num1/10;
        }
        return count;
    }
    static int MulDigit(int num2){
        int mul = 1;
        while(num2 > 0){
            int temp = num2 % 10;
            mul *= temp;
            num2/=10;
        }
        return mul;
    }
    static int Reverse(int num2) {
        int reverse = 0;
        while (num2 > 0) {
            int temp = num2 % 10;
            reverse = reverse*10 + temp;
            num2 /= 10;
        }
        return reverse;
    }
    static boolean isPalindrome(int num2){
        int reverse = 0;
        int check = 0;
        int original = num2;
        while (num2 > 0) {
            int temp = num2 % 10;
            reverse = reverse * 10 + temp;
            num2 /= 10;
        if (original == reverse){
            check = 1;
        }
        }
        return check == 1;
    }
    /*
    111
    111
     */
    static boolean isAmstrong(int num){
        int digits = 0;
        int original = num;
        int sum = 0;
        int check = 0;
        while(num>0){
            digits++;
            num/=10;
        }
        num = original;
        while(original>0){
            int temp = original%10;
            sum = sum + (int)Math.pow(temp,digits);
            original /= 10;
        }

        return sum == num;
    }


}
