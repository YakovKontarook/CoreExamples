package InnerNestedEnum.Inner;

/*
    Анонимный класс расширяет другой класс или реализует внешний интерфейс при объявлении одного единственного объекта;
    Остальным будет соответствовать реализация, определенная в самом классе.
*/

import java.util.Comparator;
import java.util.Date;

public class AnonymousClass {
    public void ex() {
        Date d = new Date() {
            int value = 55; // доступ только внутри анонимного класса, в отличии от локального (созданного с помощью MyDate extends Date)

            @Override
            public String toString() {
                return "new version toString() method";
            }
        };
        System.out.println(d);
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }
}


