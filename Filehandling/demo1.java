package Filehandling;

import java.io.*;

public class demo1 {

    public static void main(String[] args)  throws IOException {
        
        File file=new File("Noone");
        System.out.println(file.isDirectory());
        
        File java=new File(file, "java.txt");
        File jawa=new File(file, "c.txt");

        // java.createNewFile();
        // jawa.createNewFile();
        //Write operation in File
        FileWriter fw =new FileWriter(java );
        fw.write("Hello Piyush");
        fw.close();


        FileWriter fw1=new FileWriter(jawa);
        fw1.write("Here learning File System in java");
        fw1.flush();


        FileReader fr=new FileReader(java);
        int i= fr.read();
        System.out.println((char)i);

        
    
    }
    
}
