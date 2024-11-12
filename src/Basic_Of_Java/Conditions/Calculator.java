package Basic_Of_Java.Conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true)
        {
            System.out.print("Enter The Operator:");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op=='+'){
                    ans = num1 + num2;
                }

                if(op=='-'){
                    ans = num1 - num2;
                }

                if(op=='*'){
                    ans = num1 * num2;
                }

                if(op=='%'){
                    ans = num1 % num2;
                }

                if (op == '/')
                {
                    if(num2 != 0)
                    {
                        ans = num1 / num2;
                    }
                }

            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else{
                System.out.println("Invalid Operator!!");
//                System.exit(0); // it will react as a break
            }
            System.out.println(ans);
        }


    }
}
