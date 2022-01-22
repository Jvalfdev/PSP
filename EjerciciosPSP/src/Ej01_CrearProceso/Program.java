package Ej01_CrearProceso;
//import java.io.*;

public class Program {
    public static void main(String [] args) throws Exception{
        ProcessBuilder pb = new ProcessBuilder("notepad");
        pb.start();

        
    }
}
