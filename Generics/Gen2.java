package Generics;

import java.util.*;
import java.util.List;
//inbuild methods of collections !
public class Gen2 {
    public static void main(String[] args) {
        List <String> al=new ArrayList<String>();
        al.add("Piyush");
        al.add("Singh");
        al.add("Rajput");
        System.out.println(al);

        Collections.sort(al);
        
        System.out.println(al);
        List ls=Collections.emptyList();

        System.out.println(ls);
        ArrayList all=new ArrayList();
        System.out.println(all);
    
    
        }
    
}
