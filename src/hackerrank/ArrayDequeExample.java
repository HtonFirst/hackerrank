package hackerrank;

import java.util.*;

public class ArrayDequeExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] valuesArray = {5, 3, 5, 2, 3, 2};
        Deque deque = new ArrayDeque<>();

        int n = 6;
        int m = 3;

        for (int i = 0; i < n; i++) {
            int num = valuesArray[i];
            deque.add(Integer.valueOf(num));
            list.add(Integer.valueOf(num));

        }

        System.out.println(deque);
        int maxSum =0;

        for (int i=0; i<=(n -m); i++) {

            Set<Integer> set = new HashSet<>();
            for (int j=i; j< (i+m); j++) {
                set.add(list.get(j));
            }

            if (maxSum<set.size()) {
                maxSum = set.size();
            }
        }

        System.out.println(maxSum);

    }
}
