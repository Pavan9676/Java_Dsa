package BasicInterviewQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=0; i<num; i++){
            System.out.println(nTh(i));
        }
    }

    static int nTh(int n){
        if (n<=1){
            return n;
        }
        int pre = 0;
        int current = 1;
        for(int i = 0;i<n-1;i++){
            int ne = pre+ current;
            pre = current;
            current = ne;

        }
        return  current;
    }

    static int nthFibo(int n){
        if(n<=1){
            return n;
        }
        int prevFibo = 0;
        int currentFibo = 1;
        for(int i = 0; i<=n; i++){
            int newFibo = prevFibo + currentFibo;
            prevFibo = currentFibo;
            currentFibo = newFibo;
        }
        return currentFibo;
    }
}
