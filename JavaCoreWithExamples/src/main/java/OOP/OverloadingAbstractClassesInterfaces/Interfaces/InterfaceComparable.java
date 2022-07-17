package OOP.OverloadingAbstractClassesInterfaces.Interfaces;

import java.util.Arrays;
import java.util.Comparator;

/*
    Метод compareTo должен выполнять следущие условия:

            sgn(x.compareTo(y))==-sgn(y.compareTo(x))
            если x.compareTo(y)выбрасывает исключение,то и y.compareTo(x)должен выбрасывать исключение
            если x.compareTo(y) > 0и y.compareTo(z) < 0,тогда x.compareTo(z) > 0
            если x.compareTo(y) == 0и y.compareTo(z) == 0,тогда x.compareTo(z) == 0
            x.compareTo(y) == 0, тогда и только тогда, когда x.equals(y); (рекомендуемо, но необязательно)
*/

public class InterfaceComparable {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, 2, -5, 0};
        Arrays.sort(arr);

        Comparator<IntHolder> reverseOrderComparator = new ReverseOrderComparator();
        IntHolder[] holders = {new IntHolder(1), new IntHolder(-1), new IntHolder(10)};
        Arrays.sort(holders, reverseOrderComparator);   // не знает как сравнивать, нужно унаследоваться от интерфейса Comparable
        // либо передаем в аргумент объект класса унаследованого от Comparator, если нужно задать способ сравнения
    }
}

class ReverseOrderComparator implements Comparator<IntHolder> {

    @Override
    public int compare(IntHolder o1, IntHolder o2) {
        return Integer.compare(o2.getValue(), o1.getValue());
    }
}

class IntHolder implements Comparable<IntHolder> {
    private final int value;

    public IntHolder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // > 0 == this > other
    // 0 == this == other
    // < 0 == this < other
    @Override
    public int compareTo(IntHolder other) {
        return Integer.compare(value, other.value);
    }
}
