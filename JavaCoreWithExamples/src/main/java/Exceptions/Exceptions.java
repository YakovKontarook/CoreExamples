package Exceptions;
/*
        Исключение - это особое состояние, которое возникает в кодовой последовательности во время выполнения.

        В машинных языках, не поддерживающих обработку исключений, ошибки должны быть проверены и обработаны вручную
    обычно с помощью кодов ошибки, и т.д.
    Обработка иключений в Java переносит урпаление обработкой ошибок времени выполнения в объектно-ориентированное русло.
    Исключение в Java - это объект, который описывает исключительную ситуацию, произошедшую в некоторой части кода.
    Когда исключительная ситуация возникает, создается объект, представляющий это исключение, и "брасывается" объект в метод,
    вызвавший ошибку.

    Все типы исключений являются подклассами встроенного класса Throwable
*/

public class Exceptions {
    public static void main(String[] args) throws Exception {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этот текст никогда не будет напечатан");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Уже после блока try-catch");
    }
}
