package polymorphism;

class car{
   public void drive(){
        System.out.println("The car can be driven");
    }
  public  void brake(){
        System.out.println("Car can apply braking");
    }
}
  

class maruti extends car{
   public void drive(){
        System.out.println("Maruti can be driven");
    }
   public void brake(){
        System.out.println("Maruti can apply brake");

    }
}

class toyta extends car{
  public  void drive(){
        System.out.println("Toyta can be driven");
    }
   public void brake(){
        System.out.println("toyta can apply brake");
    }
}
class hyundai extends car{
  public  void drive(){
        System.out.println("Hyundai can be driven");
    }
  public  void brake(){
        System.out.println("Hyundai can apply brake");
    }
}

class vehicle{
    //here applied the polymorphism

   public void polym(car ref){
    ref.drive();   
    ref.brake();
    
    
    
        

        System.out.println("---------------");
    }
}

public class poly3 {
    
    public static void main(String[] args) {
        maruti m1=new maruti();
        toyta t1=new toyta();
        hyundai h1= new hyundai();

        vehicle p1=new vehicle();
        p1.polym(m1);
        p1.polym(t1);
        p1.polym(h1);
    }
}
