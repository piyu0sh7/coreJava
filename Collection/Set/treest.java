package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treest {

    public static void main(String[] args) {
        TreeSet t1=new TreeSet();
        t1.add(121);
        t1.add(100);
        t1.add(1);
        t1.add(11);
       // t1.add("piyush");
        System.out.println(t1);

        Iterator itr=t1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    
}
