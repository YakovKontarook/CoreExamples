package FunctionalInterfaceLambdas.RegExp;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegExpExample2 {

    public static void main(String[] args) {
        String pattern01 = "<+";
        String pattern02 = "<?";
        String pattern03 = "<*";

        String str = "<body><h1> a<<<b </h1></body>";
        String[] result;

        result = Pattern.compile(pattern01).split(str);
        printToken(result);

        result = Pattern.compile(pattern02).split(str);
        printToken(result);

        result = Pattern.compile(pattern03).split(str);
        printToken(result);
    }

    public static void printToken(String[] tokens) {
        Arrays.stream(tokens)
                .map(str -> str.isEmpty() ? "\"\"" : str)
                .map(str -> str + "|")
                .forEachOrdered(System.out::println);
    }
}
