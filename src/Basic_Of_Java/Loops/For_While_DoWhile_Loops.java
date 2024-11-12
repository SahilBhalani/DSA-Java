package Basic_Of_Java.Loops;

public class For_While_DoWhile_Loops {
    public static void main(String[] args) {
        /*
        For Loop :-
            Syntax:-
                for(initialization;condition;increment/decrement)
                {
                    //body
                }
         */

        for (int num = 1; num <= 5 ; num+=1) {
            System.out.println(num);
        }

        /*
        While Loop
            Syntax:-
                while(condition){
                    //body
                };
         */

        int j=1;
        while(j<=5)
        {
            System.out.println(j);
            j+=1;
        };


        /*
        Do While Loop
            Syntax:-

            do{
                //body
            }while(condition);

         */

        int k=1;
        do{
            System.out.println(k);
            k+=1;
        }while(k<=5);
    }
}
