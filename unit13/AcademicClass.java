import java.util.*;
public class AcademicClass{

  private Teacher t;
  private ArrayList<Student> s = new ArrayList<Student>();

  void setTeacher(Teacher t){
    this.t = t;
  }
//add student to the list
  void addStudent(Student stu){
    s.add(stu);
  }

//prints infro about class(all teacher & students)
  void printAll(){

    System.out.println(t.getName() + " " + t.getSub());

    for(Student s1: s){
      System.out.println(s1.getName() + " "
      + s1.getNum());
    }
  }

  //returns arraylist of names whose fav # is n
  public ArrayList<Student> favNum(int n){
    ArrayList<Student> nList = new ArrayList<Student>();

    for(Student s2: s){
      if(n == s2.getNum())
        nList.add(s2);
    }
    return nList;
  }

  //return the names of those whose fav # is odd
  public ArrayList<Student> oddNum(){
    ArrayList<Student> names = new ArrayList<Student>();
    for(Student s3: s){
      if( s3.getNum() %2 != 0)
      //if we put s3, the computer doesn't know if I am refering
      //to the name or the number.
        names.add(s3);
    }
    return names;
  }

}
