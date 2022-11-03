package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {

    public static void main(String[] args) {




        String userName = "Samanth<h1>a?10_2A";
        Pattern pattern1 = Pattern.compile(UsernameValidator.regularExpression);
        Matcher matcher = pattern1.matcher(userName);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
        System.out.println(userName.matches(UsernameValidator.regularExpression));


//        if (userName.matches(UsernameValidator.regularExpression)) {
//            System.out.println("Valid");
//        } else {
//            System.out.println("Invalid");
//        }

    }
}
class UsernameValidator {


    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "([A-Za-z])(\\w{7,})";

}
