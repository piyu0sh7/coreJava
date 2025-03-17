package API_CALLS;
enum RESULT{
    PASS,FAIL,NA;
}


public class Enum003 {
    public static void main(String[] args) {

        RESULT R1=RESULT.PASS;
        switch (R1) {
            case PASS:
                System.out.println("PASSED . . .");
                break;
            case FAIL:
                System.out.println("FAILED . . . ");
                break;

            case NA:
            System.out.println("NOT Available  .  .  .");
            break;
            default: System.out.println("Invalid Response !");
                break;
        }
    }
    
}
