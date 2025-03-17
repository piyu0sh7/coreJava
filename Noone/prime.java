package Noone;

import java.util.Scanner;



interface inc{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        
    
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false; }
       
       
            return true; }

    }



public class prime {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(inc.isPrime(i)){
                System.out.println("Prime "+ i);
                count++;
    
            }
            else{
                System.out.println("Non prime "+i);
            }

           
        }

        System.out.println("Total prime numer till "+n +" : "+ count);
        

        sc.close();
    }
    


   
}
