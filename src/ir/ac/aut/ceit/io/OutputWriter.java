package ir.ac.aut.ceit.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputWriter {

    public static void write(String str, String filePath) {

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {
            bf.write(str);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
