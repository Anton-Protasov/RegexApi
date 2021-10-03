package youtube;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Special symbol ^ inside [...]
 */
public class Ex4 {
    public static void main(String[] args) {
        /*
        symbol ^
        it is talking to us about that will be searched all symbols except the symbol after ^
        p1 means that we are searching input of letter q after that follows any symbol except u
         */
        Pattern p1 = Pattern.compile("q[^u]");
        Matcher m1 = p1.matcher("Iraq is a country but not Iraqu");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group());
        }
        System.out.println();
    }
}
