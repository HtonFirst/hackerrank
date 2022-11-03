package hackerrank;

public class Palindrome {

    public static void main(String[] args) {

        String A = "java";


        StringBuilder sBuilder = new StringBuilder(A);
        String B = sBuilder.reverse().toString();
        if(A.compareTo(B)==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
