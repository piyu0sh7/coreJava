package intereface;

interface computer{
    void device();
}

interface human{
    void skill();
}
//multiple interface allowed in java unusually multiple inheritance
class appDev implements computer,human
{
     public void device(){
        System.out.println("This a is laptop ");
    }
    public void skill(){
        System.out.println("Here must be Developer");
    }
}


public class interfac {
    
    public static void main(String[] args) {
        appDev sofAppDev=new appDev();
        sofAppDev.device();
        sofAppDev.skill();
        
        
    }
}
