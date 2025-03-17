package API_CALLS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamLaunch {
   // @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception{
        List<Integer> l1=Arrays.asList(100,129,30,40,50);
        Stream<Integer> stream=l1.stream();
       // l1.add(1000);
        Stream sortData=stream.sorted()
        .filter(n->n%2==0)
        .forEach(System.out::println);
       
       
       
       
       
        //long count=stream.count();
       //System.out.println(count);
       //l1.forEach(c->System.out.println(c));
     //   stream.forEach(c->System.out.println(c));
      //  sortStream.forEach(c->System.out.println(c));
    }
    
}
 