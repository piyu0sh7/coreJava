package intereface;
//inner class-  member , static , Annonymous
class A{

    void disp(){
        System.out.println("Class A");
    }


   class B{
    //member
        void view(){
        System.out.println("Class b");
}
}

   static class c{
    //Static
    void viewPort(){
        System.out.println("Static called"); }
   }
}


public class innerClass {
    
    public static void main(String[] args) {
        A a1=new A();

        a1.disp();

        A.B a2=a1.new B();
        a2.view();

        A.c a3= new A.c();
        a3.viewPort();


        
    }
}
