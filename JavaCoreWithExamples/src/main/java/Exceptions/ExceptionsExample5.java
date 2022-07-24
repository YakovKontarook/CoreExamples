package Exceptions;

import java.io.IOException;

public class ExceptionsExample5 {
    public static void main(String[] args) {

    }
}

class C {
    public void method() throws Exception {

    }
}

class D extends C {
    @Override
    // при наследовании мы можем сузить тип исключения
    public void method() throws IOException, RuntimeException, ClassNotFoundException {
        System.out.println("123");
    }
}
