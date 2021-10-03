package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Word boundaries
 */

public class Ex8 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This island is beautiful");
        while (m.find()){
            System.out.println(m.group() + " " + m.start());
        }
    }
}
