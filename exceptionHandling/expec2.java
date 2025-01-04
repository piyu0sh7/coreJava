package exceptionHandling;

class piyush{
    void div() throws Exception{
        arr();
    }
    void arr() throws Exception{
        int arr[]=new int[2];
        System.out.println(arr[3]);
    }

}

public class expec2 {
    //Ducking : throws
    public static void main(String[] args)  {
        piyush p1=new piyush();
        try{
            p1.div();;
        }
        catch (Exception e){
            System.out.println("Run succesfuly  "+e);
        }

    }


}


