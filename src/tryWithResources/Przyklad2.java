package tryWithResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Przyklad2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/home/velius/IdeaProjects/szkolenie/test.txt");
        try {
            OutputStream out = new FileOutputStream("/home/velius/IdeaProjects/szkolenie/test2.txt");
            try {
                byte[] buf = new byte[255];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
