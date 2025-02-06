package Generics;

import java.util.*;

class Student1 extends Student{

    Student1(String name,int age, int Marks){
        super(name, age, Marks);
    }
}

public class gen_ComP {

    public static void main(String[] args) {
        Student1 s1=new Student1("Ayush", 18, 45);
        Student1 s2= new Student1("Piyush", 22, 50);
        Student1 s3=new Student1("Viraj", 10, 45);


        List<Student1> list=new LinkedList<Student1>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
    }
    
}
