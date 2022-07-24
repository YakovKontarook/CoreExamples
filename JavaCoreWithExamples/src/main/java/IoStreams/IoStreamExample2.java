package IoStreams;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/*
        В Java существует:
                2 типа потоков (символьные(text)/двоичные(binary));
                2 направления потоков (ввод(input)/вывод(output)).
        В результате мы получаем 4 базовых класса, имеющих дело с вводом-выводом.
                Reader: text-input
                Writer: text-output
                InputStream: byte-input
                OutputStream: byte-output
*/
public class IoStreamExample2 {
        public static void main(String[] args) throws IOException {
                PipedReader reader = new PipedReader();
                PipedWriter writer = new PipedWriter(reader);
                writer.write('!');
                System.out.println((char)reader.read());
        }
}
