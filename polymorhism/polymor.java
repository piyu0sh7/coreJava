package polymorhism;
class human{
    String name;
    int age;
    void disp(){
        System.out.println("This is Human class");
    }
    
}
class student extends human{
     void disp(){
        System.out.println("This is student class");
     }
}

class jobPerson extends human{
    void disp(){
        System.out.println("This is Jobed class");
    }
}

public class polymor {
    public static void main(String[] args) {
        student s1=new student();
        jobPerson j1=new jobPerson();

        human h1;
        h1=s1;
        h1.disp();
        h1=j1;
        h1.disp();
        

    }
    
}
