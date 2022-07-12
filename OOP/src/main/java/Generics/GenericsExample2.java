package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsExample2 {
    public static void main(String[] args) {
        Holder<MyNumber> myNumberHolder = new Holder<>(new MyNumber());

        Collection<String> collection = new ArrayList<>();
        String result = GenericsExample2.max(collection, 123);

        Collection<Integer> intValues = new ArrayList<>();
        Integer max = GenericsExample2.max(intValues, "123");

    }
    public static <R extends Object & Comparable<R>, T> R max(Collection<R> coll, T value) {
        throw new UnsupportedOperationException();
    }
}

class Holder<T extends Number & Cloneable & Comparable<T>> {


    private final T value;

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class MyNumber extends Number implements Comparable<MyNumber>, Cloneable {

    @Override
    public int compareTo(MyNumber o) {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}