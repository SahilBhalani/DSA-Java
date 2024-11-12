package Basic_Of_Java.Conditions;

public class If_Else {
    /* Syntax:

            if(Boolean Expression True Or False / Condition)
            {
            //body
            }else
            {
            //body
            }

     */


    public static void main(String[] args) {

        int salary = 25000;
//        if(salary >= 24000)
//        {
//          salary+=3000;
//        } else  {
//            salary+=2000;
//        }

        if (salary >=26000)
        {
            salary+=3000;
        } else if (salary >=20000) {
            salary+=10000;
        }else
        {
            salary-=2000;
        }

        System.out.println(salary);

    }
}
