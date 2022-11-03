package hackerrank;

public class OneDimensionArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        int point = 0;
        boolean res = false;
        int n = game.length;
        int counter = 0;

        while (point < n) {


            try {

                if (point >= n - 1) {
                    res = true;
                    break;
                }

                if (game[point + leap] == 0 || (point + leap) > n - 1) {
                    point += leap;
                    System.out.println("+leap point = " + point);
                    counter = 0;


                } else if (game[point + 1] == 0) {


                    point++;
                    System.out.println("+1 point = " + point);



                } else  {
                    int flag = point;
                    for (int i = point; i > 0; i--) {
                        if (game[i - 1 + leap] == 0 && game[i - 1] == 0 ) {
                            point = i - 1;

                         }
                    }
                    if (point == flag) {
                        counter = 4;
                    }


                }


            } catch (ArrayIndexOutOfBoundsException e) {

                res = true;
            }
        }


        return  res;
    }

    public static void main(String[] args) {
        int[] game = {0,0,0,1,1,1};
        int size = 6;
        int leap = 5;

        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
}
