package FunctionalInterfaceLambdas.DefaultMethods;

public class DefaultMethodsExample2 {
    public static void main(String[] args) {
        A implementation = new Implementation();
        implementation.method();
    }
}

class Base {
    void method() {
        System.out.println("From Base class");
    }
}

interface A {
    default void method() {
        System.out.println("From A interface");
    }
}

interface B {
    default void method() {
        System.out.println("From A interface");
    }
}

class Implementation extends Base implements A, B {
    @Override
    public void method() {
        A.super.method();
    }
}