package OverloadingAbstractClassesInterfaces.Interfaces;

public class InnerInterfaceExample {
    public static void main(String[] args) {

    }
}

interface Map {
    Object put(Object key, Object value);

    interface Entry { // неявно стоит модификатор public
        Object getKey();
        Object getValue();
    }
}

class MyMap implements Map {

    @Override
    public Object put(Object key, Object value) {
        return null;
    }
}

class MyEntry implements Map.Entry { // обращаемся к вложенному интерфейсу реализуем все его функции

    @Override
    public Object getKey() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }
}