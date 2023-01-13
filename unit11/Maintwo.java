import java.util.*;
public class Maintwo{
  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();

    Human h1 = new Human("Crystal");

    Cat c1 = new Cat("Oreo");

    Animal a1 = new Animal("dog", 4, true);
    Animal a2 = new Animal("fish", 0, false);

    animals.add(h1);
    animals.add(c1);
    animals.add(a1);
    animals.add(a2);

    AnimalCalculator ac = new AnimalCalculator();
    //we have to create to access the method printAnimals to test out if it works or not
    ac.printAnimals(animals);

    System.out.println(ac.avgLegs(animals));

    Animal r = ac.fewestLegs(animals);
    System.out.println(r.getName()); 
  }
}
