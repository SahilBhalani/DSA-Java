package Basic_Of_Java.Conditions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String Department = in.next();

       /* switch(EmpID)
        {
            case 1:
                System.out.println("Sahil");
                break;

            case 2:
                System.out.println("nitya");
                break;

            case 3:
                System.out.println("Emp 3");
                    switch (Department){
                        case "It":
                            System.out.println("It Department");
                            break;

                        case "Medical":
                            System.out.println("Medical DepartMent");
                            break;

                        default:
                            System.out.println("Enter The Department");
                    }
                    break;

            default:
                System.out.println("Enter Valid EmpID");
        }*/

        // Better Way of Nested Switch
        switch (EmpID) {
            case 1 -> System.out.println("Sahil");
            case 2 -> System.out.println("nitya");
            case 3 -> {
                System.out.println("Emp 3");
                switch (Department) {
                    case "It" -> System.out.println("It Department");
                    case "Medical" -> System.out.println("Medical DepartMent");
                    default -> System.out.println("Enter The Department");
                }
            }
            default -> System.out.println("Enter Valid EmpID");
        }
    }
}
