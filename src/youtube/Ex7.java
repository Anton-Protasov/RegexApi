package youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Greedy and Reluctant quantifiers (operator)
Searching string in the quotation marks "..."
 */
public class Ex7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\".*\"");
        Matcher m = p.matcher("Lets try to find a \"String1\"");
        while (m.find()){
            System.out.println(m.group() + " on a position: " + m.start());
        }

        /*
        Pattern is used above will not work correctly for all cases due to the
        "Greedy quantifiers".
        For instance:
         */
        Matcher m2 = p.matcher("\"String1\" has been already found but \"String2\"");
        while (m2.find()){
            System.out.println(m2.group() + " on a position: " + m2.start());
        }

        /*
        But this situation easily could be fixed by changing the behaviour from Greedy to Reluctant
         */
        Pattern p1 = Pattern.compile("\".*?\"");
        Matcher m3 = p1.matcher("\"String1\" has been already found but \"String2\"");
        while (m3.find()){
            System.out.print(m3.group() + " on a position: " + m3.start() + " ");
        }
        System.out.println();

        /*
        Technical solution applying symbol of exception (^)
        Symbol "*" = symbol "+"
         */
        Pattern p2 = Pattern.compile("\"[^\"\r\n]*\"");
        Matcher m4 = p2.matcher("\"String1\" has been already found but \"String2\"");
        while (m4.find()){
            System.out.print(m4.group() + " on a position: " + m4.start() + " ");
        }
    }
}
