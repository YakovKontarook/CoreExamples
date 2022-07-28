package Collections;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

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
        Comparator<GeometricObject> comparator = new GeometricObjectComparator();
        Set<GeometricObject> set = new TreeSet<>(comparator);
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element : set) {
            System.out.println("area = " + element.getArea());
        }
    }
}

abstract class GeometricObject {
    public abstract double getArea();
}

class Rectangle extends GeometricObject {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        return Double.compare(area1, area2);
    }
}