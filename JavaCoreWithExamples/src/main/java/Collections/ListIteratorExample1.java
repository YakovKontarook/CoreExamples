package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
        Списки List
    Список - упорядоченная коллекция (иногда называется sequence)
    Список может содержать повторяющиеся элементы.
    Интерфейс List сохраняет последовательность добавления элементов и позволяет осуществлять доступ к элементу по индексу.

*/
public class ListIteratorExample1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // integers.remove(3); // удаление по индексу
        // integers.remove(Integer.valueOf(3)); // удаление по значению
        System.out.println(integers);

        // итератор находится "между" элементами добавляет и меняет значение на которое "смотрит"
        // метод ListIterator.remove() удаляет элемент который находится "позади"
        ListIterator<Integer> listIterator = integers.listIterator();
        // смотрим на 0 элемент (значение 1)
        System.out.println("[0]" + listIterator.next()); // смотрим на 1 элемент (значение 2)
        System.out.println("[1]" + listIterator.next()); // смотрим на 2 элемент (значаение 3)
        listIterator.remove(); // удаляем эелемент позади (значение 2)
        System.out.println("[1]" + listIterator.previous()); // возвращаемся, смотрим на 0 элемент (значение 1)
        listIterator.add(100500); // меняем значение у 0 элемента
        System.out.println(integers);
    }
}
