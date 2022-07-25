package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
        Для обхода коллекций можно использовать:
    for-each - Конструкция for-each является краткой формой записи обхода коллекции с использованием цикла for.
    Iterator - Итератор - это объект, который позволяет осуществлять обход коллекции и при желании удалять избранные элементы.

*/
public class CollectionsIteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        MyCollection myCollection = new MyCollection();
        for (String current : myCollection) {
            System.out.println(current);
            if (current.equals("e")) {
                break;
            }
        }
        // через метод forEach и methodReference
        list.forEach(System.out::println);

    }
}

class MyCollection implements Iterable<String> {

    private final String[] strings = {"a", "e", "f"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < strings.length;
            }

            @Override
            public String next() {
                return strings[currentIndex++];
            }
        };
    }
}
