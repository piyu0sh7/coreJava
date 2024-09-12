package inheritance;
class human{
    int age;
    void info(){
        System.out.println("classHuman called");
    }
    public human(){
        age=21;
        System.out.println("age for human" +age);
    }
    public human(int age){
        this.age=age;
        System.out.println("New age from child "+age);
    }
}


class student extends human{
    student(int age){
        this();
        System.out.println("Super() called");
    }
    student(){
        System.out.println("this called");
    }
}

public class inherit {
    public static void main(String[] args) {
        //System.out.println("HEllo");
        student s1=new student(18);
        
        
    }
}
