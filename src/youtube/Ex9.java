package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Anchors
- Beginning and end of a String
- Verification if a string is a number
- Pattern.MULTILINE regime
 */

public class Ex9 {
    public static void main(String[] args) {
        // check if "a" is a beginning of a string
        // ^a = \Aa
        Pattern p1 = Pattern.compile("^a");
        // check if "c" is a end of a string
        // c& = c\z but \z takes into account all strings without \n
        Pattern p2 = Pattern.compile("c$");
        Matcher m1 = p1.matcher("abc");
        Matcher m2 = p2.matcher("abc");
        while (m1.find()){
            System.out.println(m1.group() + " " + m1.start());
        }
        while (m2.find()) {
            System.out.println(m2.group() + " " + m2.start());
        }

        // If we need to check if all elements of a string are digital
        Pattern p3 = Pattern.compile("^\\d+$");
        Matcher m3 = p3.matcher("a3b2c"); // will not be find
        Matcher m4 = p3.matcher("1234"); // ok
        if (m3.find()){
            System.out.println("m3 is a number");
        }
        if (m4.find()){
            System.out.println("m4 is a number");
        }

        /*
        if there are several lines
        symbol& in the SingleLine regime will find end of the last line
        to find end for each line you need to switch on a MultiLine regime
         */
        Pattern p4 = Pattern.compile("ne$");
        Matcher m5 = p4.matcher("first line\nsecond line");
        while (m5.find()){
            System.out.println(m5.group() + " " + m5.start());
        }
        Pattern p5 = Pattern.compile("ne$", Pattern.MULTILINE);
        Matcher m6 = p5.matcher("first line\nsecond line");
        while (m6.find()){
            System.out.print(m6.group() + " " + m6.start() + " ");
        }
    }
}
