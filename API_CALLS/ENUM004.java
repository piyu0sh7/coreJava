package API_CALLS;

class Plane{
void fly(){
    System.out.println("Plane Flying");
}
}
class cargoPlane extends Plane{
    @Override
    void fly(){
        System.out.println("Cargo Fly");
    }
}

//Custom annotations:

@interface piyush{

}


public class ENUM004 {
    public static void main(String[] args) {
        
        //annotations::
        @piyush
        Plane p1=new cargoPlane();
        p1.fly();


        

    }
    
}
