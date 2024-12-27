package ProtoType_Design.Student;

import ProtoType_Design.Prototype.Prototype;

public class Student implements Prototype{

    int age;
    private int roll_number;
    String name;
    Student()
    {

    }
    public Student(int age, int roll_number, String name)
    {
        this.age=age;
        this.roll_number=roll_number;
        this.name=name;
    }
    public void display()
    {
        System.out.println(age);

        System.out.println(roll_number);
        System.out.println(name);
    }
    @Override
    public Prototype clone()
    {
        return new Student(age,roll_number,name);
    }
}
