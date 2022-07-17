package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExample5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> checkedList = Collections.checkedList(list, String.class);
        list.add("1");
        list.add("2");
        list.add("3");

        List raw = checkedList;

        List<Integer> numbers = raw;

        numbers.add(1);

        Integer integer = numbers.get(0);
        System.out.println(integer); // ClassCastException

    }
}
