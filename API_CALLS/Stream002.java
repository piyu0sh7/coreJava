package API_CALLS;

import java.util.*;
import java.util.List;
import java.util.stream.*;

import Collection.List.arylist;

public class Stream002 {

    public static void main(String[] args) {

        

        List<Integer> l1=Arrays.asList(10,2,4,6,22,543,5,21);

        Stream<Integer> st1=l1.stream();
        Stream finalStream=st1.sorted().
        map( n->(n+2)).filter(n->n%2==0);
        System.out.println(l1);
        System.out.println("----------------");
        finalStream.forEach(n->System.out.println(n));
        System.out.println("-------------");
        l1.forEach(System.out::println);



    }
    
}
