import java.util.ArrayList;

public class ShapeCollection{

  //create arraylist
  private ArrayList<Shape> aList = new ArrayList<Shape>();

    //add shape to colleciton
    void addShape(Shape s){
      //s will be added to the arraylsit
      aList.add(s);
    }

    //take shape as input, when you look up a shape by name,
    //it returns nofsides and getName
    int numOfSides(String shapeName){

      for(Shape s: aList){
        if(shapeName.equals(s.getName()))
          return s.getnOfsides();
      }
      return -1;
    }

    //return average number of sides of the shape
    int averageNumSides(){

      int sum = 0;
      for(Shape s: aList){
        sum += s.getnOfsides();
      }
      return sum/aList.size();
    }

    //return arraylist of shapes w/ even number of nofsides
    ArrayList<Shape> evenShapes(){

    ArrayList<Shape> even = new ArrayList<Shape>();

    for(Shape s: aList){
      if(s.getnOfsides() % 2 == 0)
        even.add(s);
    }
    return even;

    }
  }
