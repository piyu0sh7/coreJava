package InterFaceRev;

//import InterFaceRev.Planet.Mercury;
//import InterFaceRev.Planet.Saturn;

class Planet{
    void disp(){
        System.out.println("Outer Class");
    }
    class Mercury{
        void Mer(){
            System.out.println("Member inner class");
        }
    }

    static class Saturn{
        void Sat(){
            System.out.println("Static inner class ");
        }
    }
}

public class moreInnerClass {

    public static void main(String[] args) {
        //Member inner Class:
        System.out.println();
        Planet p1=new Planet();
        Planet.Mercury m1=p1.new Mercury();
        Planet.Saturn s1=new Planet.Saturn();

        p1.disp();
        m1.Mer();
        s1.Sat();


    }
    
}
