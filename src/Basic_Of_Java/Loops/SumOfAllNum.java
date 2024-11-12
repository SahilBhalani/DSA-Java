package Basic_Of_Java.Loops;

public class SumOfAllNum {
    public static void main(String[] args) {
        int n = 12345;
        int ans= 0;
        int r = 0;
        while(n>0)
        {
            r = n % 10;
            ans = ans+r;
            n = n / 10;
        }


        System.out.println(ans);
    }
}
