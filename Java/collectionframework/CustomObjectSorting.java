package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int id;
    int marks;
    public Student(String name , int id , int marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}
public class CustomObjectSorting {
    public static void main(String[] args) {
        Student s1 = new Student("Gurava" , 101 , 90);
        Student s2 = new Student("Suman " , 102 , 89);
        Student s3 = new Student("Bhanu" , 103 , 80);
        Student s4 = new Student("Manikanta" , 104 , 90);
        List<Student > studentList = new ArrayList<>(List.of(s1 ,s2 , s3 ,s4));
        studentList.sort((a , b) ->{
            return a.marks - b.marks;
        });
        System.out.println(studentList);

    }
}
