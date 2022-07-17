package OOP.InnerNestedEnum.Inner.Enum;

/*
    В отличии от статических контстант, предоставляют типизированный, безопасный способ задания фиксированных наборов значений
Являются классами специального вида, не могут иметь наследников, сами в свою очередь наследуются от java.langEnum
и реализуют java.lang.Comparable (следовательно могут быть сортированы) и java.io.Serializable

Перечисления не могут быть абстрактными и содержать абстрактные методы(кроме случая, когда каждый объект перечисления реализовывает абстрактный метод),
но могут реализовывать интерфейсы.

Enums переопределяют toString() и определяют valueOf()
*/

import java.util.Comparator;

public class EnumExample {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.temperature());
        System.out.println(Season.SUMMER.temperature());
    }
}
enum Season implements Comparator<Season> {
    WINTER(0),
    SPRING(12),
    SUMMER(26),
    AUTUMN(16);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int temperature() {
        return temperature;
    }
    @Override
    public int compare(Season o1, Season o2) {
        return 0;
    }
}
