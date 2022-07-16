package OverloadingAbstractClassesInterfaces.Interfaces;

/*
    Интерфейсы в java применяются для добавления к классам новых возможностей, которых нет и не может быть в базовых классах
    Интерфейсы говорят о том, что класс может делать, но не говорят, как он должен это делать
    Интрефейс гарантирует (определяет контракт), какие методы должен выполнять класс, но как класс выполняет контракт интерфейс контролировать не может

    Если класс не реализует все методы из интерфейса он должен быть абстрактным
*/

import java.util.Comparator;

public class InterfaceExample implements MyInterface {

    Comparator<String> comparator = new Comparator<String>() {  // Comparator является интерфейсом,
        // создавая обьект comparator через оператор new мы неявно создаем новым анонимный класс,
        // который имплементирует интерфейс Comparator
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    };
    Comparator<String> comparatorLambda = (o1, o2) -> 0; // также мы можем сделать это через лямбда функию (java8+)

    double PI = MyInterface.PI;

    @Override
    public int getValue() {
        return 123;
    }
}

class InterfaceExample2 implements MyInterface2 {

    @Override
    public int getValue() {
        return 321;
    }

    @Override
    public int getAnotherValue() {
        return 456;
    }
}
