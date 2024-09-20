package encapsulation;

class student{
    private int age;
    private String name;

    private void disp(){
        System.out.println("the name is "+name +" age is "+ age);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


}

class encapsul{

    public static void main(String[] args) {
        student s1=new student();
        
        s1.setName("Piyush");
        s1.setAge(21);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}