package IoStreams;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample4 {
    public static void main(String args[]) throws IOException {
        String tmp = "abcdefghijclmnopqrstuvwxyz";
        int length = tmp.length();
        char c[] = new char[length];

        tmp.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 0, 5);
        int i;

        System.out.println("input is:");
        while ((i = input1.read()) != -1) {
            System.out.println((char) i);
        }
        System.out.println();

    }

}
