package InterFaceRev;

interface i1{
    void play();
    int num=10;
} 

interface i2{
    void exit();
}

class data implements i1,i2{
    public void play(){
        System.out.println("Call from interface i1");
    }

    public void exit(){
        System.out.println("Call from interface i2");
    }
}
public class test1 {
    
    public static void main(String[] args) {
        int a=i1.num;
        

        System.out.println(a);

        data d1=new data();   
        d1.play();    
        d1.exit();
        
    }
    
    


}
