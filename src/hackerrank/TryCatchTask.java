package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class TryCatchTask {
    public static void main(String[] args) {





    try(Scanner scanner = new Scanner(System.in)){
       int x = scanner.nextInt();
       int y = scanner.nextInt();
        System.out.println(x/y);
        BigInteger bigInteger = new BigInteger("4343252253493495734759479357345974953423");
        BigInteger bigInteger1 = new BigInteger("534");
        System.out.println("B Int " + bigInteger1.add(bigInteger));

    } catch (Exception e) {
//      String s =  e;
        System.out.println(e);
    }
        System.out.println("End");
}
}
