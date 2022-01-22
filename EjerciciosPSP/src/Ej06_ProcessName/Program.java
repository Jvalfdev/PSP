package Ej06_ProcessName;
import java.util.Scanner;

public class Program {
    
    public static void main (String [] args) throws Exception{

        //We ask for a name
        System.out.println("Which name you want to call this thread?");

        //We prepare the user input through Scanner class
        Scanner ip = new Scanner(System.in);

        //The String introduced by Scanner (System.in) are saved in this variable called name 
        String name = ip.nextLine();

        //We create a a new TestThread class
        TestThread TestThread1 = new TestThread(name);

        //Starting start() methods of TestThread
        TestThread1.start();

        //Closing the Scanner input to dont let the system leak resources
        ip.close();
    }
}
