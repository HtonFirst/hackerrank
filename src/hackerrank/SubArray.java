package hackerrank;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {1, -2, 4, -5, 1};
        int n = 5;

        int counter =0;

        for (int i=0; i<n; i++) {
            int sum = array[i];
            System.out.println(" next  i = "+ i);
            if (array[i]<0) {
                counter++;
                System.out.println(" array["+i+"]" + array[i]);
            }
            for (int j=i+1; j<n; j++) {
                sum +=array[j];
                if (sum<0) {
                    System.out.println("i =  " + i);
                    System.out.println("j =  " + (j -1));
                    System.out.println("negative  sum  = " + sum);
                    counter++;
                }

            }
        }

        System.out.println(counter);

    }
}
