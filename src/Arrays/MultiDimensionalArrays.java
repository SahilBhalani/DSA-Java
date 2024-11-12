package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // declaration and initialization of 2D array.

        Scanner in = new Scanner(System.in);
        // input of 2d array
        for(int row = 0; row < arr.length; row++) {
            // for taking column in length of row
            for(int col=0;col< arr[row].length;col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        // output of 2d array using Arrays function and for each loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
