package filemanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCsvFile {
    public static void main(String[] args) {
        String filePath = "D:\\Java-Lab\\Java\\filemanipulation\\test3.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
