package BasicInterviewQuestions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method 1 using number/2
    static boolean isPrime(int num){
        if (num < 2){
            return  false;
        }
        for(int i = 2; i <= num/2; i++){
            if (num%i==0){
                return  false;
            }
        }
        return true;
    }

    // Method 2 using square root of a number
    static boolean primeOptimised(int num){
        // If num is less than 2, return false;
        if(num<2){
            return false;
        }
        for(int i = 2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
