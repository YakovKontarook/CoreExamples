package Collections;

/*
        ArrayList-список на базе массива(реализация List)
                Достоинства:
                        -Быстрый доступ по индексу
                        -Быстрая вставка и удаление элементов с конца
                Недостатки:
                        -Медленная вставка и удаление элементов
        Аналогичен Vector за исключением потокобезопасности
        Применения:
                -"Бесконечнй" массив
                -Стек
*/

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>(6);
        objects.add(10); // происходит копирование внутреннего массива, создается массив в 1.5 раза больше
    }
}
