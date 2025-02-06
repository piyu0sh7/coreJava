package Generics;

import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int age;
    int Marks;

    Student(String name, int age,int Marks){
        this.name=name;
        this.age=age;
        this.Marks=Marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return Marks;
    }
    //to_String is function in parent class i.e, object->Parent class !
    public String toString(){
        return "->" +Marks + " "+ age +" " + name;
    }

    

 
   //This is Comparable 
    public int compareTo(Student o) {
       
        if(this.age>o.age){
            return 1;
        }
        else{
            return -1;
        }
        
    }

   
    


}



public class to_String {


    public static void main(String[] args) {
        Student s1=new Student("piyush", 21, 98);
        Student s2=new Student("Ayush", 19, 90);
        Student s3=new Student("Viraj", 12, 99);
        
        
        ArrayList<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        //Collections.sort(list); here we will use comparator !

        Comparator<Student> com= (Student a, Student b)->{
            if(a.age>b.age){
                return 1;
            }
            else
            return -1;
        };


      //  Collections.sort(list, com);
        Collections.sort(list);
        
      System.out.println(list);
    }
    
}
