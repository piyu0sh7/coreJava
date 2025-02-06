package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        
    
    File file =new File("Noone");
   // System.out.println(file.exists());

    File data=new File(file,"java.txt");
    //System.out.println(data.exists());
    int count=0;

    FileWriter f1=new FileWriter(data, true);

    f1.write("HEllo from part 2 , demo 2");
    f1.close();
//used for list of file in diirectory
//-file.list  -
        String str[]=file.list();
        for(String name:str){
            count++;
            System.out.println(name);
        }//hence stored in the String for the value retrivement !
        //System.out.println(str); provides address for the file.list
        System.out.println(count);

    }}
