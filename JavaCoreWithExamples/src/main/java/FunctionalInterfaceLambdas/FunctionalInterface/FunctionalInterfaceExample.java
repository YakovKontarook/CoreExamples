package FunctionalInterfaceLambdas.FunctionalInterface;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Comparator<String> lengthStringComparator = Comparator.comparingInt(String::length); // ссылка на статический метод

        System.out.println("Hello Lambdas!");

        Consumer<Object> sout = System.out::println;
        sout.accept("Hello Again");

        Stream.of(1, 2, 3, 4)
                .filter(integer -> integer < 2)
                .forEachOrdered(System.out::println);

        lengthStringComparator.compare("1", "123");

        Comparator<String> comparator = (o1, o2) -> {
            return Integer.compare(o1.length(), o2.length());
        };

        Random random = new Random();
        Supplier<Integer> supplier1 = random::nextInt;
        Supplier<Integer> supplier2 = () -> random.nextInt();

        PersonFactory factory = Person::new;
        factory.create("Jack", "Black");
    }

    static class Person {
        private String name;
        private String lastname;

        public Person(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }

    interface PersonFactory {
        Person create(String name, String lastname);
    }

    private static Comparator<String> getLengthComparator() {
        return (o1, o2) -> Integer.compare(o1.length(), o2.length()); // expression-lambda
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        };
    }
}
