package customexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {
        String fileName = "/Users/venkyreddy/Downloads/CoreJava2/src/main/java/customexceptions/topic";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
