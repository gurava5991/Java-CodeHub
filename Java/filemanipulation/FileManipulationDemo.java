package filemanipulation;

import java.io.File;
import java.io.IOException;

public class FileManipulationDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file =  new File("D:\\Java-Lab\\Java\\filemanipulation\\test1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.exists());


    }
}
