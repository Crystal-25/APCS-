import java.util.*;

public class Person{
  private String name;
  private int npets;

  public Person(String name, int npets){ //constructor w/ instuction
  //public accesor
  this.name = name;
  this.npets = npets;
  }

  public String getName(){
    return name;
  }
  public int getPets(){
    return npets;
  }
}
