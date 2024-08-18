package exceptionHandling;
import java.io.*;
class M{
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
public class TestThrows2 {
    public static void main(String[] args) throws IOException{
        M m = new M();
        m.method();
    }
}
