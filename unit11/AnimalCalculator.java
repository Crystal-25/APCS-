import java.util.*;
public class AnimalCalculator{

  public void printAnimals(ArrayList<Animal> animals){

    for(Animal a: animals){
      //a stores each object as it iterate(repeat) through it
      //animals is the arraylist name
      System.out.println(a.getName() + " " + a.getlegCount() + " " + a.getFurrines());
      if(a.getFurrines() == true){//this checks if it is true or false
        System.out.println("furry");
      }
      else{
        System.out.println("not furry");
      }
    }
  }

  public double avgLegs(ArrayList<Animal> animals){
    //don't need to set it equal to new arraylist bc we don't
    //need to create a new obj

    int sum = 0;
    for(Animal a: animals){
      sum += a.getlegCount();
    }
    double average = sum/animals.size();
    return average;
  }

  public Animal fewestLegs(ArrayList<Animal> animals){
    //it is Animal instead of string bc we're return the NAME OF OBJECT

    Animal f = animals.get(0); // f(fewest) is stored to compare with the others

    for(Animal a: animals){
      if(a.getlegCount() < f.getlegCount()){
        f = a;
      }
    }
      return f;
    }
  }
