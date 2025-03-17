package API_CALLS;


import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketplayer{
    //meta-annotation

    String country() default "India";
    int age() default 45;
}
@Cricketplayer(country = "india")
class virat{
    @Cricketplayer
    int runs;
    @Cricketplayer
    void play(){
        System.out.println("Playing ...");


    }

    void out(){
        System.out.println("Out");

    }

    virat(){

    }
}



public class anno2 {

    public static void main(String[] args) {
        // custom Annotation
        virat v1=new virat();
        v1.runs=100;
        System.out.println(v1.runs);

        //reflection API :-

        Class c=v1.getClass();
        Annotation a=c.getAnnotation(Cricketplayer.class);
        Cricketplayer cp=(Cricketplayer)a;
        System.out.println(cp.country());
        System.out.println(a);
        System.out.println(cp);
    }
    
}
