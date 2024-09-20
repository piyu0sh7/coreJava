package Abstraction;

abstract class aeroPlane{
    //100% abstrraction acheived
    abstract  void fly();

    abstract void takeoff();
}
class fighterPlane extends aeroPlane{
    void fly(){
        System.out.println("FighterPlane can fly");
    }
    void takeoff(){
        System.out.println("FighterPlane can takeOff");
    }
}

public class absract {
    public static void main(String[] args) {
        //System.out.println("Hello");

        aeroPlane a1=new fighterPlane();
        a1.fly();
        a1.takeoff();
    }
}
