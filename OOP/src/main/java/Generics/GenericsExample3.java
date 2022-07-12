package Generics;

import java.util.ArrayList;
import java.util.List;

//      Wildcards
//          <? extends Object> == <?> - любой тип наследник Object
//          PECS: producer extends consumer super

public class GenericsExample3 {
    public static void main(String[] args) {
        List<? super Number> list1 = new ArrayList<Number>();
        List<? extends Number> list2 = new ArrayList<Number>();

        list1.add(null); // можем добавить только значение null

        list1.add(1); // consumer используем <? super Number>
        Number number = list2.get(0); // producer используем <? extends Number>
    }
}
