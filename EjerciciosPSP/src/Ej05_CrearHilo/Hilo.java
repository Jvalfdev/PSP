package Ej05_CrearHilo;

public class Hilo extends Thread{
    //Atributos
    int a = 5;
    //Métodos
    public Hilo(int a){
        this.a = a;
    }
    public void run(){
        for (int b = 1 ; b <= a ; b++)
        System.out.println("This is my " + b + " execution");
    }
}
