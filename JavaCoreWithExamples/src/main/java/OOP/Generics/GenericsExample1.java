package OOP.Generics;
import java.util.ArrayList;
/*
        Определение параметризованного класса:

    С помощью шаблонов можно создавать параметризованные (родовые, generics) классы и методы, что позволяет
    использовать более строгую типизацию.
    Появились в Java 5
    Проверяются на этапе компиляции
*/
public class GenericsExample1 {

    public static void main(String[] args) {
        //BeforeJava5();

        //После Java5
        ArrayList <String> genericsStringList = new ArrayList<>();
        genericsStringList.add("Hello World!");
        String genericValue1 = genericsStringList.get(0);
        System.out.println(genericValue1);

        genericsStringList.add("123"); // компилятор проверяет тип еще на этапе компиляции
        String genericValue2 = genericsStringList.get(1);
        System.out.println(genericValue2);

        Message<Integer, String> message = new Message<>();
    }

    private static void BeforeJava5() {
        ArrayList stringList = new ArrayList();
        stringList.add("Hello World!");
        String value1 = (String) stringList.get(0);
        System.out.println(value1);

        stringList.add(123); // компилятор не может проверить тип на этапе компиляции
        String value2 = (String) stringList.get(1);
        System.out.println(value2);
    }
}
class Message<T1 extends Number, T2 extends CharSequence> { // T1, T2 - фиктивные типы, определяются при создании объекта
    T1 id;
    T2 name;

    public T1 getId() {
        return id;
    }

    public void setId(T1 id) {
        this.id = id;
    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }
}
