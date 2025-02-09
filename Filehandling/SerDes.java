package Filehandling;

import java.io.OutputStream;
import java.io.*;

//Serialization Practically
class Player implements Serializable{
    String name;
    int age;
    int weight;

    Player(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    

    void Disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
    }
}

public class SerDes {
    public static void main(String[] args) throws Exception{
        Player p1=new Player("Piyush", 22, 65);
        Player p2=new Player("Ayush", 22, 65);
       // File f1=new File("Noone");

      // p1.Disp();
      // p2.Disp();
       //Serialization !
      //  FileOutputStream fos=new FileOutputStream("java.txt");
        //Here buffer can be used for more efficient handling
        //BufferedOutputStream bos=new BufferedOutputStream(fos);
        //ObjectOutputStream oos=new ObjectOutputStream(bos);
        //oos.writeObject(p1);
        //oos.writeObject(p2);
        //oos.flush();
        //oos.close();
    


        //From here Deserilization Starts!
        FileInputStream fis=new FileInputStream("java.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Player p3Player=(Player)ois.readObject();
        Player p4Player=(Player)ois.readObject();
       // Player p5Player=(Player)ois.readObject();

        p3Player.Disp();
        p4Player.Disp();
        //p5Player.Disp();
        
    
    
    
    }
    
}
