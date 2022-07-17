package InnerNestedEnum.Inner;

/*
        Доступ к элементам внутреннего класса возможен только из внешнего класса через объект внутреннего.
    Объект внутреннего класса имеет ссылку на объект своего внешнего класса. Эта ссылка неявная.
    static методы невозможны для внутреннего класса.
*/

public class InnerExample {

    public static void main(String[] args) {
    }
}

class OuterInner {
    private String str = "Hello World!";

    public void outerMethod() {
        System.out.println(str);
        System.out.println(new Inner().value); // Доступ через оъект внутреннего класса
    }

    class Inner {

        private String str = "I'm from Inner";
        private int value = 42;

        void printHello() {
            System.out.println(OuterInner.this.str); // Неявная ссылка на внешний объект.
        }
    }
}
