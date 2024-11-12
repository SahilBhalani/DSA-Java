package Basic_Of_Java.Methods;

import java.util.Arrays;

public class CheckValues {

    public static void main(String[] args) {
        int[] array = {1,2,3,5,6};
        array1(array);
        System.out.println(Arrays.toString(array));
    }

    static void array1(int[] nums){
        nums[0] = 99;
    }
}
