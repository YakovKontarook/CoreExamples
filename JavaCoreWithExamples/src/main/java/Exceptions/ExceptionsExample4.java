package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionsExample4 {
    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        IOException ex = null;
        try {
            stream = new FileInputStream("123");
            System.out.println("Before exception");
            if (true) {
                stream.read();
            }
            System.out.println("After Exception");
        } catch (IOException e) {
            ex = e;
            // до появления try-with-resources
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException closeEx) {
                    if (ex != null) {
                        closeEx.initCause(ex);
                    }
                    throw ex;
                }
            }
        }
        // после появления try-with-resources
        try (InputStream stream1 = null) {
            stream.read();
        }
    }
}
