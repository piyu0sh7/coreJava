package Generics;

import java.util.ArrayList;

public class Gen1 {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();

        al.add(10);
        al.add(4);
      //  al.add("Piyush");
        al.add(100);
        al.add(75);

        System.out.println(al);

        al.add(10000);

        //Dynamical and homogenous
    }
    
}
