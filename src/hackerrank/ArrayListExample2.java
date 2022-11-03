package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample2 {
    public static void main(String[] args) {

        List<List<Integer>> resList = new ArrayList<>();
        int[][] arr = {{41, 77, 74, 22, 44}, {12}, {37, 34, 36, 52}, {}, {20, 22, 33}};
        for(int[] a:arr) {
            resList.add(Arrays.stream(a).boxed().collect(Collectors.toList())
            );

        }
        System.out.println(resList);



        int qQuantity = 5;


        for (int i=0; i<qQuantity; i++) {
            int a = 1;
            int b = 3;
//            try {
//
//                System.out.println(resList.get(a).get(b));
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("ERROR!");
//            }


         System.out.println(resList.get(a));
        }

    }
}
