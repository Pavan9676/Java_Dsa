package BasicInterviewQuestions;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(isLeap(num));
    }
    static boolean isLeap(int num){
        if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0){
            return true;
        }
        return false;
    }
}
