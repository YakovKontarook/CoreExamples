package Collections;

/*
        Сравнение коллекций. Comparator, Comparable

    Естественный порядок сортировки (natural order sort) - естественный и реализованный по умолчанию (реализацией метода compareTo интерфейса java.lang.Comparable) способ
сравнения двух экземпляров одного класса.
    -int compareTo(E other) - сравнивает this объект с other и возвращает отрицательное значение если this < other,
        0 - если онпи равны и положительное значение, если this < other.

        Реализация Comparable позволяет:
        -Вызвать Collections.sort и Collections.binarySearch
        -Вызвать Arrays.sort и Arrays.binarySearch
        -Использовать такие объекты, как keys в TreeMap
        -Использовать такие объекты, как elements в TreeSet

        При реализации интерфейса Comparator<T> существует возможность сортировки списка объектов конкретного типа по правилам, определенным для этого типа.
        Для этого необходимо реализовать метод int compare(T ob1, T ob2), принимающий в качестве параметров два объекта для которых
        должно быть определено возвращаемое целое значение, знак которогот и определяет правило сортировки.
        Этот метод автоматически вызывается методом sort(List<T> list, Comparator<? super T> c) класса Collections,в качестве первого параметра
        принимающий коллекцию, в качестве второго - объект-comparator, из которого извлекается правило сортировки.
*/
public class CollectionsComparableExample {

    public static void main(String[] args) {

    }
}
