package InterFaceRev;
  class student{
   private String name;
    private int roll;
    private int attedence;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getAttedence() {
        return attedence;
    }
    public void setAttedence(int attedence) {
        this.attedence = attedence;
    }
   

}

public class oops {
   public static void main(String[] args) {
    student jhanvee= new student();
    
    
    
    
    jhanvee.setRoll(13);
    System.out.println(jhanvee.getRoll());

   }
    
}
