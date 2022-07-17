package OOP.InnerNestedEnum.Inner;

/*
        Подкласс вложенного класса не наследует возможность доступа к членам внешнего класса,
                которым наделен его суперкласс
*/

public class NestedExample {

    public static void main(String[] args) {

    }
}

class OuterNested {
    private static int x = 10;

    static class Nested {
        public static void method() {
            System.out.println("Nested outer.x = " + x);
        }
    }
}

class Outer extends OuterNested.Nested {
    public static void method() {
        System.out.println("x= + x"); // нет доступа к членам внешнего класса
    }
}
