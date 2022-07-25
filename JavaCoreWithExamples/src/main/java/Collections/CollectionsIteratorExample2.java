package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class CollectionsIteratorExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //elementData.length == 5
        //cursor = 0

        //elementData.length == 5
        //cursor = 1

        //elementData.length == 5
        //cursor = 2

        //elementData.length == 5
        //cursor = 3

        //elementData.length == 5
        //cursor = 4

        Iterator<Integer> iterator1 = list.iterator();
        list.clear();
        System.out.println(iterator1.next());

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer current = iterator.next();
            if (current > 3) {
//                list.remove(current); // concurrentModificationException
                iterator.remove(); // удаление в коллекциях
            }
        }

//        верный способ удаления(фильтрации) списков
        Predicate<Integer> graterThan4 = value -> value > 4;
        list.removeIf(graterThan4);


        System.out.println(list);
    }
}
