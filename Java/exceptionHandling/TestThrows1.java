package exceptionHandling;
import java.io.*;
public class TestThrows1 {
    static void method() throws IOException{
        throw new IOException("Device Error");
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
