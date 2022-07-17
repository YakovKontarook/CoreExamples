package OOP.Iterator;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class IteratorExamples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Iterator<Integer> arrayIterator = new Iterator<>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < arr.length;
            }

            @Override
            public Integer next() {
                return arr[current++];
            }
        };

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        Iterator<Integer> randomIntsIterator = new Iterator<>() {

            private int available = 50;

            @Override
            public boolean hasNext() {
                return available != 0;
            }

            @Override
            public Integer next() {
                available--;
                return ThreadLocalRandom.current().nextInt();
            }
        };

        int counter = 0;
        while (randomIntsIterator.hasNext()) {
            System.out.println(counter++ + " " + randomIntsIterator.next());
        }
    }
}
