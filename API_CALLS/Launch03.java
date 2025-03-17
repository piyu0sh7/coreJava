package API_CALLS;

import java.util.*;

public class Launch03 {

    //For Each:
public static void main(String[] args) {
    

   /*  List<Integer> l1=new ArrayList<Integer>();
    l1.add(10);
    l1.add(15);
    l1.add(1);
    l1.add(7);
    l1.add(14);

    System.out.println(l1);
    */


    List<Integer> l2=Arrays.asList(10,15,1,7,14);
    System.out.println(l2);
   // for(Integer in:l2){
     //   System.out.println(in);
    //}
    //using lambda Experession
    l2.forEach(n->System.out.println(n));


}
}
