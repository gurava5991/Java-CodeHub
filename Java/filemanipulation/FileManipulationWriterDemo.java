package filemanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulationWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java-Lab\\Java\\filemanipulation\\test3.csv"))) {

            // Write header
            bw.write("ID,Name,Department");
            bw.newLine();

            // Write data rows
            bw.write("1,John Doe,Engineering");
            bw.newLine();
            bw.write("2,Jane Smith,Marketing");
            bw.newLine();
            bw.write("3,Emily Johnson,Finance");
            bw.newLine();
            bw.write("4,Michael Brown,Sales");
            bw.newLine();
            bw.write("5,Linda White,HR");
            bw.newLine();

            System.out.println("CSV data written successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
