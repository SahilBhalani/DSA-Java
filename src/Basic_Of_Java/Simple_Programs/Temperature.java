package Basic_Of_Java.Simple_Programs;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Temperature In Celsius :");

        float TempC = sc.nextFloat();

        float TempF = (TempC * 9 / 5) + 32;
        System.out.println(TempF);
    }

}
