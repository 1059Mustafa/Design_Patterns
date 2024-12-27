package ProtoType_Design.Main;

import ProtoType_Design.Student.Student;

public class Main {
    public static void main(String[] args)
    {
        Student obj=new Student(20,75,"RAM");
        Student clone_obj=(Student)obj.clone();
        clone_obj.display();
        obj.display();
    }
}
