package tryWithResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Przyklad1 {
    public static void main(String[] args) {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("/home/velius/IdeaProjects/szkolenie/test.txt"));
            System.out.println(fileReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}