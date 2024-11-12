package Arrays;

import java.util.Arrays;

public class MaxNumOfarray {
    public static void main(String[] args) {
        int[] arr = {2,53,423,343,324,45};

        System.out.println(maxRange(arr,1,5));;

    }

    static int maxRange(int[] arr, int start,int end){
        int maxVal = arr[start];

        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
