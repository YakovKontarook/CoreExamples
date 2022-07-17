package FunctionalInterfaceLambdas.RegExp;

/*
        Регулярные выражения (regular expressions) - современная система поиска текстовых фрагментов в электронных документах,
основанная на специальной системе записи образцов для поиска.

В стандартную библиотеку Java входит пакет, специально предназначенный для работы с регулярными выражениями - java.util.regex.

Эта библиотека может быть использована для выполнения таких задач:
    - поиск данных;
    - проверка данных
    - выборочное изменение данных;
    - выделение фрагментов данных;
    - и др.

    Letters: "abc"
    Digits: "123", "\d\d\d" \D for non-digit
    Any Character: "\."
    Starts With Only a,b or c: "[^a,b,c]an" // (can, ban, aan)
    Starts Not With  a,b nor c: "[^b]og"   // (hog, dog, !bog)
    Starts With Any Upper Case Letter: "[^A-Z]"
    Starts With Any Lower Case Letter: "[^a-z]"
    "[A-Za-z0-9_]" == "\w"
    "wazzzzzup" == "waz{2,5}up" if z >= 3 "waz{3,}up" if z == 5 waz{5}up
    "a{2,}b*c+" == "aaaabcc", "aabbbbc", "aacc" (b* == ноль или более раз, c+ == один или более раз)
    Any Whitespace: "\s" Any Non-Whitespace: "\S"
    Starts and ends: "^.....$"
    Capture group: "(\w+)\.pdf$ == file_35r472.pdf"
    "I love (cats|dogs) " == "I love cats", "I love dogs"

    Pattern & Matcher
    Patter - скомпилированное представление регулярного выражения
    Matcher - движок, который производит операцию сравнения(match)
    PatternSyntaxException - указывает на синтаксическую ошибку в выражении

    Методы класса Pattern
    Pattern compile(String regex) - возвращает Pattern, который соответствует шаблону regex
    Matcher matcher(CharSequence Input) - возвращает Matcher, с помощью которого можно находить соответствия в строке input
    boolean matches(String regex, CharSequence input) - проверяет на соответствие строки input шаблону regex
    String pattern() - возвращает строку, соответствующую шаблону
    String[] split(CharSequence input) - разбивает строку input, учитывая, что разделителем является шаблон
    String[] split(CharSequence input, int limit) - разбивает строку input на не более чем limit частей

    Методы класса Matcher
    Начальное состояние объекта Matcher неопределено
    boolean matches() - проверяет соответствует ли вся строка шаблону
    boolean lookingAt() - пытается найти последовательность символов, начинающейся с начала строки и соответствующей шаблону
    boolean find() или boolean find(int start) - пытается найти последовательность символов соответствующих шаблону в любом месте строки
Параметр start указывает на начальную позицию поиска
    int end() - возвращает индекс последнего символа подпоследовательности, удволетворяещей шаблону.
    reset() или reset(CharSequence input) - сбрасывает состояние Matcher'а в исходное, также устанавливает новую последовательность символов для поиска
    replaceAll(String replacement) - замена всех подпоследовательностей символов, удовлетворяющих шаблону, на заданную строку
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("1*0");
        Matcher m = p.matcher("11111110");
        boolean b = m.matches();

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());
    }
}
