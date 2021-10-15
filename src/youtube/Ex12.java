package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Groups
 */

public class Ex12 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("get(Value)?"); // expression in the brackets is a backreference
        // expression is a group.
        // each group could be memorized
        // if we do not want to memorize a group it should be marked up: (?:_____)
        // any expression could be used in the brackets. e.g.: get(Value|Null)
        Matcher m1 = p1.matcher("get or getValue");
        while (m1.find()) {
            System.out.println(m1.group() + " in the " + m1.start() + " position");
        }

        System.out.println("EditPad lite".replaceAll("EditPad (lite|pro)", "$1 version"));

        Pattern p2 = Pattern.compile("([a-c])x\\1x\\1"); // we create a group ([a-c])
        // and after we can refer to this group by \\1
        // but \\1 returns a value that already is found [a-c] = a;
        Matcher m2 = p2.matcher("axaxa");
        while (m2.find()) {
            System.out.println(m2.group() + " in the " + m2.start() + " position");
        }

        // expression like the following will not work
        Pattern p3 = Pattern.compile("([a-c])x\\1x\\1");
        Matcher m3 = p3.matcher("axbxa");
        while (m3.find()) {
            System.out.println(m3.group() + " in the " + m3.start() + " position");
        }

        // Task: find repeating words in the text and delete repetition
        System.out.println("text text".replaceAll("\\b(\\w+)\\s+\\1\\b", "$1"));
        // \\b____\\b - boundary of all repeating words
        // (\\w+) - any symbols that is a word
        // s - all repeating spaces
        // \\1 - do searching the word again


        // NAMING OF GROUPS
        System.out.println("text".replaceAll("(?<name1>e)", "${name1}-"));
    }
}

