package ObjectedOrientedProgram.ClassAndObjectDemo;
class Student{
    int id ;
    String name;
    public Student(int id , String  name){
        this.id = id;
        this.name = name;
    }
    //instance method
    void printStudentDetails(){
        System.out.println("id : " + this.id + " name : " + this.name);
    }
}
public class College {
    public static void main(String[] args) {
        Student student = new Student(121 , "Bhanu");
        student.printStudentDetails();


    }
}
