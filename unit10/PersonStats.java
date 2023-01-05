import java.util.*;

public class PersonStats{
  public static int averagePets(ArrayList<Person> pets){
    int total = 0;

    for(int i = 0; i<pets.size(); i++){
      int n = pets.get(i).getPets();

      total += n;
    }
    return total/pets.size();
  }
  public static String mostPets(ArrayList<Person> names){
    float most = 0;
    String mostNames = "";
    for(Person n: names){
      if(n.getPets() > most){
        most = n.getPets();
        mostNames = n.getName();
        }
      }
        return mostNames;
    }
  public static ArrayList<Person> twoPets(ArrayList<Person> names){
    ArrayList<Person> result = new ArrayList<Person>();
    for (Person n: names){
      if(n.getPets() >= 2){
        result.add(n);
        }
      }
      return result;
    }
  public static void main(String[] args){
    ArrayList<Person> people = new ArrayList<Person>();
    Person p1 = new Person("Eloise", 3);
      people.add(p1);
    Person p2 = new Person("Ava", 2);
      people.add(p2);
    Person p3 = new Person("Crystal", 100);
      people.add(p3);

      System.out.println("avg Pets: " + averagePets(people));
      System.out.println("most # of pets: " + mostPets(people));
      System.out.print("2 or more pets: ");
      ArrayList<Person> r = twoPets(people);
      for(Person p : r){
        System.out.print(p.getName()  + " ");
      }
    }
  }
