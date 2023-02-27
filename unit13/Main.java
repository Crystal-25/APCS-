import java.util.*;
public class Main{

    public static void main(String[] args){

      Teacher t1 = new Teacher("Kessner", "APCS");
      AcademicClass a1 = new AcademicClass();
      a1.setTeacher(t1);

      Student s1 = new Student("Crystal", 15);
      Student s2 = new Student("Jim", 16);
      a1.addStudent(s1);
      /*adds student object, s1, to a collection of students
      a1. It would create a new 'Student'object with the names &
      #: Crystal 15, Jim 16... and add it to the list of students
      in a1, which is the AcademicCourse*/
      a1.addStudent(s2);

      System.out.println("test printAll(): ");
      a1.printAll();

      System.out.println("test favNum: ");
      ArrayList<Student> favList = a1.favNum(23);

      for(Student s: favList){
        System.out.println(s.getName() + " " + s.getNum());
      }

      ArrayList<Student> oddNumList = a1.oddNum();
      
    }
  }
