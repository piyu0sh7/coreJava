package MultiThread;

class MyThread extends Thread{
     public void run(){
        System.out.println(Thread.currentThread());
    }
}

public class try02 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        MyThread mt=new MyThread();
        mt.start();
    }
    
}
