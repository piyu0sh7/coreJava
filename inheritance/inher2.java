package inheritance;
class parent{
    void gender(){
        System.out.println("MAlE");
    }
}

class child extends parent{

}

public class inher2 {
    public static void main(String[] args) {
     child c1=new child();
     c1.gender();   
    }
    
}
