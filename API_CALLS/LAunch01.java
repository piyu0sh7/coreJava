package API_CALLS;

public class LAunch01 {

    public static void main(String[] args) {
        java.util.Date uDate=new java.util.Date();
       long Time= uDate.getTime();

        java.sql.Date sDate=new java.sql.Date(Time);
        System.out.println("SQL Data : "+sDate);
        System.out.println("Util Data : "+uDate);
        System.out.println(Time );


    }
    
}
 