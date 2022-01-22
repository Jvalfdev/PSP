package Ej06_ProcessName;

public class TestThread extends Thread {
    //Attributes
    

    

    //Methods
    public TestThread( String name){
        super(name);
    }

    public void start(){
        System.out.println("I'm  thread and my name is " + getName());
    }
}
