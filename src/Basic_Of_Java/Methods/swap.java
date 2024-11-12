package Basic_Of_Java.Methods;

public class swap {
    public static void main(String[] args) {
        swap(30,10);
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+" "+b);


    }
}
