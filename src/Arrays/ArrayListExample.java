package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        // initialisation of an arraylist
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        //input of an arraylist
        list.add(256);
        list.add(246);
        list.add(245);
        list.add(43);
        list.add(234);
        list.add(256);

        //printing arraylist
        System.out.println(list);

        //update elements in arraylist
        list.set(1,45);
        System.out.println(list);
    }
}
