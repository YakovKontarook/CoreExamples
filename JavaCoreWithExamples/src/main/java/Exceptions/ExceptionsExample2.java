package Exceptions;

import java.io.IOException;

public class ExceptionsExample2 {
    public static void main(String[] args) throws IOException {
        Thread.setDefaultUncaughtExceptionHandler((t, e) ->
                System.out.println("In Thread" + t + " was thrown exception " + e));

        String valueInMain = "main";
        method1();
        System.out.println(valueInMain);
    }

    public static void method1() throws IOException {
        int valueInMethod1 = 14;
        method2();
        System.out.println(valueInMethod1);
    }

    public static void method2() throws IOException {
        throw new IOException("My Exception");
    }
}
