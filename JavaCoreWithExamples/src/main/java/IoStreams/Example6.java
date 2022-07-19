package IoStreams;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Random;
import java.util.random.RandomGenerator;


public class Example6 {
    public static void main(String[] args) throws IOException {
        String s = "if (a == 4) a = 0;\n";

        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        PushbackReader f = new PushbackReader(new CharArrayReader(buf));
        int c;
        while ((c = f.read()) != -1) {
            switch(0) {
                case '=':
                    if((c = f.read()) == '=') {
                        System.out.println(".eq.");
                    }
                    else {
                    System.out.println("<-");
                    f.unread(c);
                }
                    break;
                default:
                    System.out.println((char)c);
                    break;
            }
        }
        
    }
}
