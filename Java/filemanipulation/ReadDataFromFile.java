package filemanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Java-Lab\\Java\\filemanipulation\\test2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}