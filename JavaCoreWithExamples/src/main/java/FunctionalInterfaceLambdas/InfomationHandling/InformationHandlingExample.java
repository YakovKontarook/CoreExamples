package FunctionalInterfaceLambdas.InfomationHandling;

/*
            Строка - объект класса String/
        Строка является неизменяемой (immutable). Содержимое строки не может быть изменено после создания объекта
    при помощи какого либо метода.
    Любое изменение происходит через создание нового объекта.
    Ссылку на объект класса String (и объект любого другого класса тоже) можно изменить так, чтобы она указывала на другой объект,
    т.е. на другое значение.
*/

public class InformationHandlingExample {
    public static void main(String[] args) {
        String str = "\uD86A\uDFCE";
        System.out.println(str.length());
    }
}