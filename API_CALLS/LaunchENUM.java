package API_CALLS;
enum week{
        MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class LaunchENUM {
    public static void main(String[] args) {
        enum Result{
            PASS,FAIL,Nr;
        }
        week mon=week.MON;
        //System.out.println(mon);

        Result res=Result.PASS;
       // System.out.println(res);
        //System.out.println(mon.ordinal());
        
        week[] w=week.values();

        for(week n:w  ){
            System.out.println(n+" : "+n.ordinal() );
        }
    
    
    }
    
}
