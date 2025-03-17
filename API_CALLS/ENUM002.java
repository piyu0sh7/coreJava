package API_CALLS;

enum Marks{
    PASS,FAIL,Nr;

    Marks(){
        System.out.println("Constructor called");
    }

    int marks;
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }
}

public class ENUM002 {

    public static void main(String[] args) {
        Marks m1=Marks.PASS;
        m1.setMarks(100);
        int n=m1.getMarks();
        System.out.println(n);

        Marks.FAIL.setMarks(20);;
        int n2=Marks.FAIL.getMarks();
        System.out.println(n2);

        int n11=Marks.Nr.getMarks();
        System.out.println(n11);

    
    }
    
}
