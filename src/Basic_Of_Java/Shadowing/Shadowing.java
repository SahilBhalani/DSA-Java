package Basic_Of_Java.Shadowing;

public class Shadowing {
   static int x = 90; // this will be shadowed at line 10.
    public static void main(String[] args) {

        System.out.println(x); // 90
        int x; //
       // System.out.println(x); // in here shadowing not done because it's done when the variable initialised.
        x= 40; // the high-level scope is overlapped by low-level scope.
        System.out.println(x);//40 the
    }
}
