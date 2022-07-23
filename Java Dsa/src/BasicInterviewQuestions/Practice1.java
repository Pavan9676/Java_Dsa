package BasicInterviewQuestions;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value: ");
        int num = s.nextInt();
//        int num1 = s.nextInt();
//        System.out.println(fact(num));
//        for(int i = 0; i < num; i++) {
//            System.out.println(fibo(i));
//        }
//        System.out.println(hcf(num,num1));
//        System.out.println(lcm(num, num1));
//        System.out.println(leaf(num));
        System.out.println(prime(num));
    }
    static int fact(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    static int fibo(int num){
        int newv = 0;
        if(num <= 1){
            return num;
        }
            int pre = 0;
            int present = 1;
            for(int i = 0; i < num; i++){
                newv = pre + present;
                pre = present;
                present = newv;
        }
        return present;
    }
    static int hcf(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return Math.max(n1, n2);
        }
        int h = Math.min(n1, n2);
        while(true) {
            if (n1 % h == 0 && n2 % h == 0) return h;
            else {
                h--;
            }
        }
    }
    static int lcm(int n1, int n2){
        if(n1 == 0 || n2 == 0){
            return Math.max(n1,n2);
        }
        int h = Math.max(n1,n2);
        while(true){
            if(h%n1 == 0 && h%n2 == 0){
                return h;
            }
            else{
                h++;
            }
        }
    }
    static boolean leaf(int n1){
        return n1 % 4 == 0 && n1 % 100 != 0 || n1 % 400 == 0;
    }
    static boolean prime(int n){
        for(int i = 1; i <= n; i++){
            if(n%i != 0){
                return false;
            }
        }
        return true;
    }
}
