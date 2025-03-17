package MultiThread;

public class try01 {

    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
      System.out.println( Thread.currentThread().getPriority() );
       
        
    }
    
}
