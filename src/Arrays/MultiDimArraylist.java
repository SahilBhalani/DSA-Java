package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // initialization of multidimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation of inner arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //input of Multidimension Arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }
}
