package EqualsAndHashCode;

/*
//    Нативный метод HashCode
//
//    Переопределение метода HashCode - метод int HashCode() возвращает хэш-код объекта, вычисление которого управляется
//следущими соглашениями:
//    Во время работы приложения значения HashCode не изменяется, если объект не был изменен
//    Все одинаковые по содержанию объекты одного типа должны иметь одинаковые хэш-коды
//    Различные по содержанию объекты одного типа могут иметь разные хэш-коды
//
//Следует переопределять всегда, когда переопределен метод equals()
*/

import java.util.HashMap;
import java.util.Map;

public class ExampleHashCode {

    private int field;

    public ExampleHashCode(int field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExampleHashCode that = (ExampleHashCode) o;

        return field == that.field;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ExampleHashCode ref1 = new ExampleHashCode(1000);
        ExampleHashCode ref2 = new ExampleHashCode(1000);

        Map<ExampleHashCode, String> map = new HashMap<>();
        map.put(ref1, "123");
        String s = map.get(ref2);
        System.out.println(s);

        System.out.println(ref1 == ref2); // false
        System.out.println(ref1.equals(ref2)); //false
        System.out.println(ref1.hashCode() == ref2.hashCode()); //false
    }
}


