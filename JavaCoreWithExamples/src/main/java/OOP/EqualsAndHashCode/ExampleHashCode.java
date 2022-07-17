package EqualsAndHashCode;

/*
//    Нативный метод HashCode
//    Переопределение метода HashCode - метод int HashCode() возвращает хэш-код объекта, вычисление которого управляется
//следущими соглашениями:
//    Во время работы приложения значения HashCode не изменяется, если объект не был изменен
//    Все одинаковые по содержанию объекты одного типа должны иметь одинаковые хэш-коды
//    Различные по содержанию объекты одного типа могут иметь разные хэш-коды
//Следует переопределять всегда, когда переопределен метод equals()
*/

import java.util.HashMap;
import java.util.Map;

public class ExampleHashCode {
    public static void main(String[] args) {
        Paper paper = new Paper();
        System.out.println(paper.hashCode());
    }
}
class Paper {
    private int price;
    private String producerName;

    @Override
    public int hashCode() {
        return (int) (31 * price + ((null == producerName)? 0 : producerName.hashCode()));
    }
}


