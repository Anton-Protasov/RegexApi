package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
Predefined character classes
 */

public class Ex5 {
    public static void main(String[] args) {
        // d = any digit (0...9)
        Pattern p1 = Pattern.compile("\\d");
        Matcher m1 = p1.matcher("abvgd 5 and 7");
        while (m1.find()) {
            System.out.println("position is " + m1.start() + " for digital: " + m1.group());
        }
        System.out.println();
        // w = any symbol
        Pattern p2 = Pattern.compile("\\w");
        Matcher m2 = p2.matcher("a1b2v3");
        while (m2.find()) {
            System.out.println("position is " + m2.start() + " for symbol: " + m2.group());
        }
        System.out.println();
        // s = space or tab
        Pattern p3 = Pattern.compile("\\s");
        Matcher m3 = p3.matcher("a 1b   2v 3");
        while (m3.find()) {
            System.out.println("position is " + m3.start() + " for symbol: " + m3.group());
        }
        System.out.println();
        // combination option 1 - searching \d or \s
        Pattern p4 = Pattern.compile("[\\d\\s]");
        Matcher m4 = p4.matcher("abvgd5 and 7");
        while (m4.find()) {
            System.out.println("position is " + m4.start() + " for symbol: " + m4.group());
        }
        System.out.println();
        // combination option 2 - searching only \d + \s
        Pattern p5 = Pattern.compile("\\d\\s");
        Matcher m5 = p5.matcher("abvgd5 and 7");
        while (m5.find()) {
            System.out.println("position is " + m5.start() + " for symbol: " + m5.group());
        }
    }
}