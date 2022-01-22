package Ej05_CrearHilo;
import java.util.*;

public class Program {
    public static void main(String [] args) throws Exception{
        System.out.println("How many threads you want to create?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        Hilo hl = new Hilo(num);

        hl.run();

        input.close();


    }
}
