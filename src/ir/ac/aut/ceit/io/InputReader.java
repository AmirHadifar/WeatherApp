package ir.ac.aut.ceit.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputReader {

    public static String read(InputStream inputStream) {

        StringBuilder stringBuffer = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (IOException e) {
            Logger.getLogger(InputReader.class.getName()).log(Level.SEVERE, null, e);
            System.exit(0);
        }

        return stringBuffer.toString();
    }
}
