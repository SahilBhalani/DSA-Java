package Basic_Of_Java.Methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Number 1");
        int num1 = in.nextInt();

        System.out.println("Enter The Number 2");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The Sum Is :"+sum);
    }
}
