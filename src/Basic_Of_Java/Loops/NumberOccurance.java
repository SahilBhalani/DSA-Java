package Basic_Of_Java.Loops;

public class NumberOccurance {
    public static void main(String[] args) {
        int n = 4887;

        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 8)
            {
                count++;
            }
            n = n/10; //n /= 10
        }
        System.out.println(count);
    }
}
