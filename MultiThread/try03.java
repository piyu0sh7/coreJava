package MultiThread;
import java.util.*;
class CalOperation extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Give the first number ");
        x=sc.nextInt();
        System.out.println("Give the Second number ");
        y=sc.nextInt();

        System.out.println("The sum for "+x+" , "+y+" = " +x+y);

    }
}

class printOperation extends Thread {
    public void run() {
        System.out.println("Printing the table off 12 ! ");
try{
        for(int i=1;i<=10;i++){
            System.out.println("12 X " +i+ "=" +(i*12) );

            Thread.sleep(2000);
           }   }

           catch (Exception e){
            System.out.println("Error occured "+e);
           }
    }
}


public class try03 {
    public static void main(String[] args) {

        System.out.println("This is main thread");
        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println(i+" is even number ");
            }
        }

        CalOperation cl=new CalOperation();
        printOperation po=new printOperation();
        cl.start();
        po.start();
    }
    
}
