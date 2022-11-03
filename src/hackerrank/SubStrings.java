package hackerrank;

public class SubStrings {
    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i=0; i<=s.length() - k; i++) {
            System.out.println(i);
            String sub = s.substring(i,i+k);
            System.out.println(sub);
            if(smallest.compareTo(sub)>0) {
                smallest = sub;
            }
            if(largest.compareTo(sub)<0) {
                largest = sub;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        System.out.println(smallest + "\n" + largest);
    }
}
