package Collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prioritydq {

    public static void main(String[] args) {
        
        PriorityQueue p1=new PriorityQueue();
        p1.add(100000);
        p1.add(12);
        //p1.add("piyush");
        p1.add(500);
        System.out.println(p1);

        Iterator itr=p1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
    }

    
}
