package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {


    public static void main(String[] args) {

        String stringOfText = "<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>";
//        String stringOfText = "<h1>public</h1>";


//        String s1 = stringOfText.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "");;
//        System.out.println(s1);
//        String s2 = stringOfText.replaceAll("\\<([^>]*)>(.*)(\\</\\1>)", "");
//        System.out.println(s2);
//        System.out.println(stringOfText);

//        Pattern pattern = Pattern.compile("\\<([^>]*)>(.*)(\\</\\1>)");
        Pattern pattern = Pattern.compile("(\\<[^>]*>).*(\\1)");
        Matcher matcher = pattern.matcher(stringOfText);


            int counter = 0;
            while (matcher.find()) {
                System.out.println(matcher.group() + "  group 1");
                stringOfText = stringOfText.replaceAll("(\\<[^>]*>).*(\\1)", "$1");
                System.out.println(stringOfText + "  string after first while loop");
            }

        Pattern pattern1 = Pattern.compile("\\<(.[^>]*)>(.*)(\\</\\1>)");
        Matcher matcher1 = pattern1.matcher(stringOfText);
//
                while (matcher1.find()) {
                    System.out.println(matcher1.group() + "   group 2");
                    System.out.println(matcher1.group().replaceAll("<[^>]*>", ""));
                    counter++;
                }





            if (counter==0) {
                System.out.println("None");
                counter = 0;
            }




//        String s3 = stringOfText.replaceAll("\\<([^>]*)>(.*)(\\</\\1>)","\\2");
//        System.out.println(s3);

    }
}
