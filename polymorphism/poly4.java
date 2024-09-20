package polymorphism;

class child{
    void name(){
        System.out.println("i'm Men according to me ");
    }
}
class father extends child{
    void name(){
        System.out.println("son according to father");
    }
}
class teacher extends child{
    void name(){
        System.out.println("Student according to teacher");
    }
}

class brother extends child{
    void name(){
        System.out.println("brother according to brother");
    }
}
class grandElder extends child{
    void name(){
        System.out.println("GrandSon according grandElder");
    }
}

class pollly{
    void polySon(child reference){
        reference.name();
        System.out.println("------------");
    }
}
public class poly4 {
    public static void main(String[] args) {
        father f1=new father();
        brother b1=new brother();
        teacher t1=new teacher();
        grandElder g1=new grandElder();
        child c1=new child();
        pollly p1=new pollly();


        p1.polySon(f1);
        p1.polySon(b1);
        p1.polySon(t1);
        p1.polySon(g1);
        p1.polySon(c1);
    }
    
}
