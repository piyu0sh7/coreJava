package API_CALLS;

interface piyush{
    default void study(){
            System.out.println("study  now");
        }
    }
    class child implements piyush{
        @Override
        public void study(){
            System.out.println("Study");
        }
        
           
        }
        
        
        public class annotaion {
        
        
        public static void main(String[] args) {
            child c1=new child();
            c1.study();
    
        
}
    
}
