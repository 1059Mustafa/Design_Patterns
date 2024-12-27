package Builder_Design.Client;

import Builder_Design.Director.Director;
import Builder_Design.Student.Student;
import Builder_Design.StudentBuilder.EngineeringStudentBuilder;
import Builder_Design.StudentBuilder.MBAStudentBuilder;


//Client -> Director -> StudentBuilder -> Student
public class Client {
    public static void main(String[] args){

        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }

}
