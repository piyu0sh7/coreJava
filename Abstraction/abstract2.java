package Abstraction;

abstract class human{
    //not a complete abstraction acheived!
    abstract void walk();
    abstract void run();

    void die(){
        System.out.println("Human can Die ! ");
    }
}

class student extends human{
    void walk(){
        System.out.println("student can walk");
    }
    void run(){
        System.out.println("Student can run ");
    }
}
public class abstract2 {
    public static void main(String[] args) {

        human h1=new student();
        h1.die();
        h1.run();
        h1.walk();
        
    }
    
}
