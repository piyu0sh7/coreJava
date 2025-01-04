//package exceptionHandling;

import java.util.Scanner;

public class excep1 {

    //something error with multiple-try catch
    public static void main(String args[]){    
        try{    
         int a[]=new int[5];    
            a[6]=30/0;    
        }    
        catch(ArithmeticException e){System.out.println("task1 is completed");}    
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
        System.out.println("rest of the code...");    
      }    
    
    

    
}
    

