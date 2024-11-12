package Basic_Of_Java.Scope;

public class Scope {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 10; //here  variable 'a' is cant be reinitialised inside the block

                a = 20; //but here a can be updated in block
            int c = 30; // this variable c is only updated inside the block
        }
//        c=20; // here c is cant be updated outside the block
        int c = 20; // but you can initialize new variable c outside the block
        a = 100; // 'a' here is declared outside the block , updated inside the block and also be updated outside the block

        for (int i = 0; i < 10; i++) {
              int z = 10; // variable declared inside a for loop can only be accessed inside the loop
                a = 10; // here variable 'a' is outside and can be updated inside a loop
        }
    }

    static void scope()
    {
        int a = 10;
        int b = 20;

        // variable declared inside a method cant be accessed outside the method
    }
}
