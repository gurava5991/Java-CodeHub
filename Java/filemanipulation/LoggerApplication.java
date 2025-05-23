package filemanipulation;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Logger{
    private String path;
    Logger(String path){
        File file = new File(path);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.path = path;
    }
    public void log9(String message){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(message);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Failed to log this message " + message);
        }
    }
}
public class LoggerApplication {
    public static void main(String[] args) {
        Logger myLogger = new Logger("application.log");

        // Log some messages
        myLogger.log9("Application started...");
        myLogger.log9("User logged in.");
        myLogger.log9("Error: Unable to connect to the database.");
        myLogger.log9("Application closed.");
    }
}
