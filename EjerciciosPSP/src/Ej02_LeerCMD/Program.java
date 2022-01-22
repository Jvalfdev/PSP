package Ej02_LeerCMD;
import java.io.*;

public class Program {
    public static void main (String[] args) throws Exception{
        //Creamos el builder del proceso
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "dir");
        //Creamos el proceso y ejecutamos el builder
        Process p = pb.start();
        //Hacemos un InputStream para meter información al programa
        InputStream is = p.getInputStream();

        //Creamos un programa para imprimir por consola cada caracter que ha salido en el cmd
        int q;
        while((q = is.read()) != -1){
            System.out.print((char)q);
        }
        is.close();
        System.exit(0);
    }
}
