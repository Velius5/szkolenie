package tryWithResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Przyklad2New {
    public static void main(String[] args) throws IOException {
        try(InputStream in = new FileInputStream("/home/velius/IdeaProjects/szkolenie/test.txt");
            OutputStream out = new FileOutputStream("/home/velius/IdeaProjects/szkolenie/test2.txt")
        ) {
            byte[] buf = new byte[255];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
