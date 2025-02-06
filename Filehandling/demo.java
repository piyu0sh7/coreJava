package Filehandling;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException{
        File file = new File("java.txt");
        System.out.println(file.exists());
     {   //Creating a file
        file.createNewFile();
        System.out.println(file.exists());
          }
       { //Creating a directory

        File dirFile=new File("Noone");
        System.out.println(dirFile.exists());

        dirFile.mkdirs();
        System.out.println(dirFile.exists());
                            }
}
}
