package hackerrank;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        int[] line1 = {-1, -1, 0, -9, -2, -2};
        arr.add(Arrays.stream(line1).boxed().collect(Collectors.toList()));

        int[] line2 = {-2, -1, -6, -8, -2, -5};
        arr.add(Arrays.stream(line2).boxed().collect(Collectors.toList()));

        int[] line3 = {-1, -1, -1, -2, -3, -4};
        arr.add(Arrays.stream(line3).boxed().collect(Collectors.toList()));

        int[] line4 = {-1, -9, -2, -4, -4, -5};
        arr.add(Arrays.stream(line4).boxed().collect(Collectors.toList()));

        int[] line5 = {-7, -3, -3, -2, -9, -9};
        arr.add(Arrays.stream(line5).boxed().collect(Collectors.toList()));

        int[] line6 = {-1, -3, -1, -2, -4, -5};
        arr.add(Arrays.stream(line6).boxed().collect(Collectors.toList()));

        System.out.println(arr);

        Integer sum = -100;

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                Integer prSum = arr.get(i).get(j) +
                        arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) + arr.get(i+2).get(j) +
                        arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                System.out.println(prSum);
                if (prSum>sum) {
                    sum = prSum;
                }

            }
        }

        System.out.println(sum);


    }
}
