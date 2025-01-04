package InterFaceRev;
interface enviroL{
    void laptop();
}

interface enviroC{
    void computer();
}


class compiled implements enviroL,enviroC{
 void compile(){

    System.out.println("Code Compiled");
 }
 public void laptop(){
    System.out.println("This is laptop");
 }

 public void computer(){
    System.out.println("This is Computer");
 }
}
class Dev extends compiled{
    void code(){
        System.out.println("Coding");
        
    }
}


public class Developer {


    public static void main(String[] args) {
        Dev piyush =new Dev();
        piyush.code();
        piyush.compile();
        
    }
    
}
