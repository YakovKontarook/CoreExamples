package IoStreams;/*
        В Java для описания работы по вводу/выводу используется специальное понятие - поток данных (Stream).

        Поток данных связан с некоторым источником или приемником данных, способность получать или предоставлять информацию.

        Соответственно потоки деляться на входные - читающие данные, и на выходные - передающие(записывающие) данные.

        Введение концепции stream позволяет отделить программу, обменивающуюся информацией одинаковым образом с любыми устройствами,
        от низкоуровневых операций с такими устройствами ввода/вывода.

        Методы классов потокового ввода-вывода могут сгенерировать исключительную ситуацию типа IOException.
        IOException - проверяемое исключение и должно быть обработано.
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IoStreamExample {

    public static void main(String[] args) {
        // создание потокового объекта
        try(FileWriter out = new FileWriter("file.txt")) {
            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            // работа с потоком через потоковый объект
            pw.println("Hello world!");
            // закрытие потока
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
