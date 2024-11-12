package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BasicsOfArrays {

    public static void main(String[] args) {
        int[] arr = new int[5]; // declaration and initialisation of an array

        // input of an array

        arr[0]=10;
        arr[1]=14;
        arr[2]=15;
        arr[3]=16;
        arr[4]=17;

        System.out.println(Arrays.toString(arr));

        //using loop
        Scanner in = new Scanner(System.in);

        int[] arr2 = new int[4];

        for(int i = 0; i < arr2.length;i++)
        {
            arr2[i]= in.nextInt();
        }

        // print using for each loop
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
