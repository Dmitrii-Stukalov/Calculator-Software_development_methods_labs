package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * The type Write file.
 */
public class WriteFile {
    /**
     * Write.
     *
     * @param f    the f
     * @param path the path
     */
    public static void write(Fraction[] f, String path) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Fraction fr : f) {
                bufferedWriter.write(fr.getNumerator() + "/" + fr.getDenominator() + "\n");
            }
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
