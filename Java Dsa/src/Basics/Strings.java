package Basics;

public class Strings {
    public static void main(String[] args) {
        String str = "Titan paw";
        String str1 = str + "l";

        StringBuilder builder = new StringBuilder(10);
        for(int i=1;i <= 10; i++ ){
            builder.append(i);
        }
        System.out.println(builder.capacity());

        // Buffer

        StringBuffer b = new StringBuffer(20);
        for(int i = 1;i<= 20;i++){
            b.append(i);
        }
//        b.charAt(1);
        System.out.println(b.charAt(3));



        int a = 6;
        a = 7;

    }
}


// privmitives and non primiteives

