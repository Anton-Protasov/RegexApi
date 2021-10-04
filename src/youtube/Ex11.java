package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Optional item "?"
 */

public class Ex11 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("colou?r");
        Matcher m1 = p1.matcher("colour color");
        while (m1.find()) {
            System.out.print(m1.group() + " ");
        }
        System.out.println();

        Pattern p2 = Pattern.compile("nov(ember)?");
        Matcher m2 = p2.matcher("november nov");
        while (m2.find()) {
            System.out.print(m2.group() + " ");
        }

        Pattern p3 = Pattern.compile("nov(ember)??");
        Matcher m3 = p3.matcher("november nov");
        while (m3.find()) {
            System.out.print(m3.group() + " ");
        }
        System.out.println();

        Pattern p4 = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m4 = p4.matcher("Feb 23, February 23rd, February 23");
        while (m4.find()) {
            System.out.print(m4.group() + " ");
        }
    }
}
