import java.util.*;
public class Main{
  public static void main(String[] args){

    ArrayList<Vehicle> vehicles =  new ArrayList<Vehicle>();

    Bicycle b1 = new Bicycle();
    vehicles.add(b1); //you do vehicles.add becuase you are adding
    //the object you created to our fucntion bicycle

    Car c1 = new Car();
    vehicles.add(c1);

    Motorcycle m1 = new Motorcycle();
    vehicles.add(m1);

    Unicycle u1 = new Unicycle();
    vehicles.add(u1);

    for(Vehicle v: vehicles)
      System.out.println(v.name() + " " + v.wheelCount() + " " + v.isHumanPowered());


  }
}
