package InterFaceRev;

interface example{
    default void start(){
        System.out.println("Deafult called ::Start");
    }

    static void Play(){
        System.out.println("Static called :: Play");
    }

    void exit();
}

interface sigma{
    void denim();
}
class gamer implements example{
    public void exit(){
        System.out.println("old version called :: Exit");
    }
}

public class types {
    //3 types of interfaces: singly,Normal,Marker
    //Features of java 8: Default & Static Function can be defined inside interface , (Annonymous) .


    public static void main(String[] args) {
       gamer g1=new gamer();
       g1.start();
       example.Play(); 
       g1.exit();

        //Annonymoue interface;
       example ex=new example() {
        public void exit(){
            System.out.println("Terminated");
        }
       };
       ex.exit();

       //Lambda Expression:- Should have only uni function
       sigma s1=() ->{
        System.out.println("Lambda Call");
       };
       s1.denim();
       
    }
    
}
