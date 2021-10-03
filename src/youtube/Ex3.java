package youtube;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Searching the word that could be wrote in a different ways
for example:
gray / grey
 */
public class Ex3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("gr[ae]y");
        Matcher m1 = p.matcher("gray");
        Matcher m2 = p.matcher("grey");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " ");
        }
        System.out.println();
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
    }
}
