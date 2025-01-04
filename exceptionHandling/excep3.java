package exceptionHandling;

class errorr extends Exception{
  public errorr(String e){
    super(e);
  }
  public errorr()
    {
      
    };
    
}



public class excep3 {


    public static void main(String[] args) {
        //custom exception

      int a=100;
      int b=-12;
      
      try{
        if(0<b){
        int c=a/b;
        System.out.println(c);}
        else{
            throw new errorr("Piyush's error");
        }
      }
      catch (Exception e){
        System.out.println("ExCePtIoN"+e);
      }
      System.out.println("REst of COde");
      
    }
    
}
