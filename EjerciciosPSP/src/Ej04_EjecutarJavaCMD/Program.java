package Ej04_EjecutarJavaCMD;
import java.io.*;

public class Program {
    public static void main (String [] args) throws Exception{
        File ruta = new File("\\bin");
        //Este programa ejecuta por medio del cmd otro .class de otro programa java, en este caso del ejercicio3 de esta misma serie
        ProcessBuilder pb = new ProcessBuilder("java", "Ej03_LeerErroCMD.Program");
        pb.directory(ruta);

        Process p = pb.start();

        InputStream is = p.getInputStream();

        String text = "";
        int q;

        while((q = is.read()) != -1){
            text = text + (char)q;
            
        }
        System.out.println(text);
        is.close();
        System.exit(1);

    }
    
}
