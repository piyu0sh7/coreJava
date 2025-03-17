package API_CALLS;
import java.time.*;
public class Launch02 {

    public static void main(String[] args) {
     LocalDate localDate=LocalDate.now();
    // System.out.println(localDate);   
     int date=localDate.getDayOfMonth();
     int month=localDate.getMonthValue();
     int year=localDate.getYear();

     System.out.println(date+"/"+month+"/"+year);

     LocalTime localTime=LocalTime.now();
   //  System.out.println(localTime);
     int hour=localTime.getHour();
     int minute=localTime.getMinute();
     int second= localTime.getSecond();
     int nano=localTime.getNano();
        
        System.out.println(hour+":"+minute+":"+second+":"+nano);
    
        }
    
}
