package FunctionalInterfaceLambdas.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample4 {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("(\\d+) (\\d+)").matcher("123 456");
        System.out.println(matcher.find());
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
    }

}
