package tryWithResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Przyklad1New {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("/home/velius/IdeaProjects/szkolenie/test.txt"))) {
            System.out.println(fileReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}