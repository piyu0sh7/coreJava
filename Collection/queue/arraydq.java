package Collection.queue;

import java.util.ArrayDeque;

public class arraydq {

    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(11);
        ad.add(12);
        ad.add(0);
        ad.removeFirst();

        ad.add(122);

        ad.removeLast();

        System.out.println(ad);
    }
    
}
