package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListModify {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(" n = " + n);

        List<Integer> L = new ArrayList<>();
        for (int i=0; i<n; i++) {
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        System.out.println(" Q = " + Q);
        for(int j=0; j<Q; j++) {
            String str = scanner.nextLine();
            System.out.println(" str  = " + str);
            if (str == "Insert") {
                int ind = scanner.nextInt();
                int val = scanner.nextInt();
                L.remove(ind);
                L.add(ind, val);

            } else if (str == "Delete") {
                int ind = scanner.nextInt();
                int val = 0;
                L.remove(ind);
                L.add(ind, 0);

            }
        }

        for (Integer integer : L) {
            System.out.print(integer);
        }






        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

