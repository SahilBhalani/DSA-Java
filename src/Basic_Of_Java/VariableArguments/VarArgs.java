package Basic_Of_Java.VariableArguments;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,5,3,5,5,5,54,5,45,45,45);

        multiple(2,3,"sahil","nitya","akhil");

        demo(2,2,2,2,2,2,2);
        demo("saii","nitya");
    }

    // Function Overloading of VarArgs.

    static  void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static  void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,String ...v){
        System.out.println(a +" "+ b +" "+ Arrays.toString(v));
    }
}
