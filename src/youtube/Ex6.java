package youtube;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
A point "."
Point changes any symbol
mm\dd\yy
 */
public class Ex6 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Pattern p2 = Pattern.compile("\\d\\d[-\\/., ]\\d\\d[-\\/., ]\\d\\d");
        Matcher m1 = p1.matcher("10324787");
        Matcher m2 = p2.matcher("10324787");
        Matcher m3 = p1.matcher("10/24/87");
        Matcher m4 = p2.matcher("10/24/87");
        System.out.print("m1: ");
        while (m1.find()) {
            System.out.println(m1.group() + " on a position of: " + m1.start());
        }
        System.out.print("m2: ");
        while (m2.find()) {
            System.out.println(m2.group() + " on a position of: " + m2.start());
        }
        System.out.println();
        System.out.print("m3: ");
        while (m3.find()) {
            System.out.println(m3.group() + " on a position of: " + m3.start());
        }
        System.out.print("m4: ");
        while (m4.find()) {
            System.out.println(m4.group() + " on a position of: " + m4.start());
        }
    }
}
