package intereface;
interface car{
    void drive();
}

public class AnnoINc {
    public static void main(String[] args) {
        //Annonymous Class

        car c1=new car() {
            public void drive(){
                System.out.println("Driving");
            }
        };
        c1.drive();
    }
    
}
