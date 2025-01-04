package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class arylist {
public static void main(String[] args) {
    ArrayList aa=new ArrayList();
    aa.add(10);
    aa.add("piyush");
    aa.add(18);

    ArrayList ab=new ArrayList();
    ab.add(12);
    ab.addAll(aa);
    ab.add("singh");

    System.out.println(aa);
    System.out.println(ab);


    Iterator itr=ab.iterator();
    while(itr.hasNext()){

        System.out.println(itr.next());
    }
        

}
    
    
}
