import java.util.*;
public class Maintwo{
  public static void main(String[] args){

    Shape s1 = new Shape("Rectangle", 4);
    Shape s2 = new Shape("Circle", 0);

    ShapeCollection sh1 = new ShapeCollection();
    sh1.addShape(s1);
    sh1.addShape(s2);

    System.out.println("test nofSides");
    int sides1 = sh1.numOfSides("Rectangle");
    System.out.println("Rectangle " + sides1);

    int sides2 = sh1.numOfSides("Oval");
    System.out.println("Oval " + sides2);


    System.out.println("test average number of sides: ");
    System.out.println( sh1.averageNumSides() );

    ArrayList<Shape> sh2 = sh1.evenShapes();

    for(Shape s: sh2){
      System.out.println(s.getName() + " " + s.getnOfsides());
    }
  }
}
