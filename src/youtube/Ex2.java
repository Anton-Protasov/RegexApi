package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Find in the range
 */

public class Ex2 {
    public static void main(String[] args) {
        // option 1
        Pattern p1 = Pattern.compile("[a-e]");
        Matcher m1 = p1.matcher("find in the range");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " ");
        }
        System.out.println();

        // option 2
        Pattern p2 = Pattern.compile("[abcde]");
        Matcher m2 = p1.matcher("find in the range");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println();

        // option 3 "[0-9]+" - searching not only one digital but all digital (number)
        Pattern p3 = Pattern.compile("[0-9]+");
        Matcher m3 = p3.matcher("a1b12c240");
        while (m3.find()) {
            System.out.println("position " + m3.start() + "of symbol: " + m3.group() + " ");
        }
    }
}
