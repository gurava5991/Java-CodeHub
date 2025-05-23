package relationshipandobjectbehaviour;
import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}
class Teacher {
    String teacherName;
    List<Student> students; // One-to-Many association

    Teacher(String teacherName) {
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void display() {
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Students under " + teacherName + ":");
        for (Student s : students) {
            s.display();
        }
    }
}
public class OneToMany {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");

        Student s1 = new Student("Gurava");
        Student s2 = new Student("Harsha");
        Student s3 = new Student("Adithya");

        teacher.addStudent(s1);
        teacher.addStudent(s2);
        teacher.addStudent(s3);

        teacher.display();
    }
}
