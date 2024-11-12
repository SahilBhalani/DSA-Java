package Basic_Of_Java.Conditions;

import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        //int max=0;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

//        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}
