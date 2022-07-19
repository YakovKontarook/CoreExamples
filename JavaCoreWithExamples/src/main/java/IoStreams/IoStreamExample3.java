package IoStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
        Классы байтовых потоков
                Наверху этой иерархии-два абстрактных класса:InputStream и OutputStream.
                Каждый из этих абстрактных классов имеет несколько конкретных подклассов,
                которые обрабатывают различия между разными устройствами,такими как дисковые файлы,
                сетевые соеденения и даже буферы памяти.
*/
public class IoStreamExample3 {
    public static void main(String[] args) {
        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesReaded = new byte[10];
        String fileName = "test.txt";

        FileOutputStream outFile = null;
        FileInputStream inFile = null;

        try {
            // создать выходной поток
            outFile = new FileOutputStream(fileName);
            System.out.println("File is opened for write");
            // записать массив
            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");

            // создать входной поток
            inFile = new FileInputStream(fileName);
            System.out.println("Файл открыт для чтения");
            //Узнать сколько байт готово к считыванию
            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable + " бвйт");
            // считать в массив
            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println("Считано: " + count + " байт");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода " + e.toString());
        } finally {
            // Можно воспользоваться try with resources
            try {
                outFile.close();
                System.out.println("Выходной поток закрыт");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inFile.close();
                System.out.println("Входной поток закрыт");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
