package Filehandling;

import java.io.*;

public class demo3 {
    //File Reader class :

    public static void main(String[] args) throws Exception{
        File dir=new File("Noone","c.txt");
        FileReader fr=new FileReader(dir);

        FileReader fr1=new FileReader(dir);
       //Better approach for Reading data
        char ch[]=new char[(int)dir.length()];
        fr.read(ch);
        for(char chr:ch){
            System.out.print(chr);
        }


       System.out.println("______________________________");


        //~ lengthy process
        int i=fr1.read();
        //System.out.println((char)i );
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr1.read();
        }
    }
    

    
}
