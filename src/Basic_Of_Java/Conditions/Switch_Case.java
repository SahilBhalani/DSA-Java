package Basic_Of_Java.Conditions;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Normal Switch Case:-

        /*String fruit = in.next();

        switch (fruit){
            case "mango":
                System.out.println("king of fruit");
                break;

            case "apple":
                System.out.println("sweet fruit");
                break;

            case "grape":
                System.out.println("small fruit");
                break;

            default:
                System.out.println("Enter Valid Fruit");
        }
*/
//        Enhanced Switch Case:-

        int days = in.nextInt();

     /*   switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }*/

        switch (days){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
        }

        in.close();


    }
}
