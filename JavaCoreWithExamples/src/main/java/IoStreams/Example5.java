package IoStreams;

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outfilename"), "UTF-8"));

        out.write("adsf");
        out.close();
    }
}
