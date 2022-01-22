package Ej03_LeerErroCMD;
import java.io.*;

public class Program {
    public static void main (String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIRRRR");
        Process p = pb.start();

        InputStream is = p.getErrorStream();

        int q;

        String Error = "";

        while ((q = is.read()) != -1){
            Error = Error + (char)q;
        }
        System.out.println(Error);
        is.close();
        System.exit(1);
    }    

}
