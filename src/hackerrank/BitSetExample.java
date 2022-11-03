package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetExample {
    public static void main(String[] args) {
        int n = 10;
        int m = 8;
        BitSet b =new BitSet();
//        b.set(0, 5, false);
        b.set(4, true);
        System.out.println(b);
        System.out.println(b.get(0));
        System.out.println(b.get(4));
        System.out.println(b.cardinality());
        System.out.println("_________________");
        Scanner scanner = new Scanner(System.in);

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i=0; i<m; i++) {
            String oper = scanner.next();
            int firstIdx = scanner.nextInt();
            int secondIdx = scanner.nextInt();


            switch (oper) {
                case "AND": {
                    if (firstIdx == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    continue;
                }
                case "OR": {
                    if (firstIdx == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    continue;

                }
                case "XOR": {
                    if (firstIdx == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    continue;
                }
                case "SET": {
                    if (firstIdx ==1) {
                        b1.set(secondIdx,true);
                    }else {
                        b2.set(secondIdx, true);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    continue;
                }
                case "FLIP": {
                    if (firstIdx ==1) {
                        b1.flip(secondIdx);
                    }else {
                        b2.flip(secondIdx);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());

                }
            }

        }
    }
}
