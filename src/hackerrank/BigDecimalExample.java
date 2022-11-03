package hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigDecimalExample {
    public static void main(String[] args) {

//        String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        String[] s = {".0000000124", ".00000001233", ".0000000123", ".0000000123", ".000000012234"};
        int n = 5;

        List<BigDecimal> list = new ArrayList<>();

//        for (int i=0; i<s.length; i++) {
//            String str = s[i];
//            list.add(new BigDecimal(str));
//
//        }
//        System.out.println(list);
//        list.sort((a,b) -> a.compareTo(b));
//        System.out.println(list);


//            for (int i=0; i<s.length -1 ; i++) {
//                System.out.println(Arrays.toString(s));
//
//                for (int j=i+1; j<s.length; j++) {
//                    BigDecimal a = new BigDecimal(s[i]);
//                    BigDecimal b = new BigDecimal(s[j]);
//
//                    if(a.compareTo(b) <= 0) {
//                        String c = s[i];
//                        s[i] = s[j];
//                        s[j] = c;
//                    }
//
//                }
//            }

        List<BigDecimal> bdList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        // adding values to Lists
        for (int i = 0; i < n; i++) {
            if (s[i]!=null) {
                bdList.add(new BigDecimal(s[i]));
                strList.add(s[i]);
            }
        }
        // sorting List
        bdList.sort(new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(bdList);
        System.out.println(strList);
        //sorting array s
        for (int i = 0; i < n; i++) {
            BigDecimal mod = new BigDecimal(strList.get(i));

            if (i != 0 && mod.compareTo(new BigDecimal(strList.get(i - 1))) == 0) {
                int ind = bdList.indexOf(mod) + 1;
                s[ind] = strList.get(i);
            } else {
                int ind = bdList.indexOf(mod);
                System.out.println(mod);
                System.out.println(ind);
                s[ind] = strList.get(i);
                System.out.println(s[ind]);

            }
        }

            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);
            }

        System.out.println("________________________________");
            BigDecimal a1 = new BigDecimal(".00000001233");
            BigDecimal b1 = new BigDecimal(".0000000123");

        System.out.println(a1.max(b1));



    }
}