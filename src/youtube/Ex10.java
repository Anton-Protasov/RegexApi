package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/*
Pipeline
that means "or"
 */

public class Ex10 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("cat|dog");
        Matcher m1 = p1.matcher("I have a dog");
        while (m1.find()) {
            System.out.println(m1.group() + " in the " + m1.start() + " position");
        }

        Pattern p2 = Pattern.compile("get|set|getValue|setValue");
        Matcher m2 = p2.matcher("What is getValue");
        while (m2.find()) {
            System.out.println(m2.group() + " in the " + m2.start() + " position");
        }

        Pattern p3 = Pattern.compile("getValue|set|get|setValue");
        Matcher m3 = p3.matcher("What is getValue");
        while (m3.find()) {
            System.out.println(m3.group() + " in the " + m3.start() + " position");
        }

        Pattern p4 = Pattern.compile("get(Value)|set(Value)");
        Matcher m4 = p4.matcher("What is getValue");
        while (m4.find()) {
            System.out.println(m4.group() + " in the " + m4.start() + " position");
        }
    }
}
