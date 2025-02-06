package Filehandling;

import java.io.*;

public class demo4 {
    //using of buffer reader and writter


    public static void main(String[] args) throws   Exception{
        File file =new File("Noone","Java.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello sir - from buffer writter");
        bw.newLine();
        bw.write("The BufferWriter act as a motor in pipe");
        bw.close();
        //bw.flush();

      //  FileReader fr=new FileReader(file);

        PrintWriter pw=new PrintWriter(file);
        pw.println(100);
        pw.println(true);
        pw.write("the nAME IS PIYUSH");
        pw.flush();


        // char ch[]=new char[(int) file.length()];
        
       /*  fr.read(ch);
        for(char chr:ch){
            System.out.println(chr);
        }*/
       // BufferedReader br=new BufferedReader(fr);

        /* int n=br.read();
        System.out.println((char)n);
        //wrong Action
       
        while (n!=-1) {
        System.out.print((char)n);
        n=br.read();
            
        }*/ 


      /*   String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
            }


        */



    }
    
}
