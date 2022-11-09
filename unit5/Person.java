public class Person{
  private String name;
  private int numberOfPets;
  public Person(String n, int numP){
    //constructor sets the values for the instance variables
    name = n;
    numberOfPets = numP;
  }
    //accessors: geter methods where they return the value of
    //your instance variable, a method that returns smth
    String getName(){
      return name;
    }
    int getNumberOfPets(){
      return numberOfPets;
    }
    String greetings(){
  return "Hello, my name is " + name + " and I have " + numberOfPets + " pets. ";
    }
  }
