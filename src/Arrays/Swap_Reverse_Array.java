package Arrays;

import java.util.Arrays;

public class Swap_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8};
//        swap(arr,2,4);
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            swap(arr , start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
