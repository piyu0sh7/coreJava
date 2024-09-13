package polymorphism;

class aeroPlane{
   public void takeOff(){
        System.out.println("Plane takeOff");

    }
    public void fly(){
        System.out.println("Plane tends to fly");
    }

}

class cargoPlane extends aeroPlane{
   public void takeOff(){
        System.out.println("cargoplane takeOff");
    }
   public void fly(){
        System.out.println("Cargoplane tends to fly");
    }

}
class passengerPlane extends aeroPlane{
    public void takeOff(){
        System.out.println("Passengerplane takeOff");
    }
   public void fly(){
        System.out.println("passengerplane tends to fly");
    }
}

class fighterPlane extends aeroPlane{
   public void takeOff(){
        System.out.println("fighterplane takeOff");
    }
    public void fly(){
        System.out.println("Fighterplane tends to fly");
    }
}

class airPort{
  public void poly(aeroPlane ref){
    ref.takeOff();
    ref.fly();



    System.out.println("-----------------------------------");
    }
}


public class poly2 {
    public static void main(String[] args) {
       cargoPlane cg=new cargoPlane();
       passengerPlane pg=new passengerPlane();
       fighterPlane fg=new fighterPlane();

       airPort a=new airPort();
       a.poly(cg);
       a.poly(fg);
       a.poly(pg);
       
    }
}
