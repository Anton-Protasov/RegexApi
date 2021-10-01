package youtube.lesson246.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Introduction
 */

public class Ex1 {
    public static void main(String[] args) {
        /*
        Option 1
        "line".matches("pattern") is a verification that line is to be match with pattern
        "String".matches("String") will return true
        System.out.println("myemail@mail.org".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"));
        */

        // Option 2
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("my Email is myemail@mail.org please send there");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}