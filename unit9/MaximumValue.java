import java.util.*;
public class MaximumValue{
  public static double findMax(ArrayList<Double> arr){

    double max = arr.get(0);
      //arr[] goes through every index in the element and compares to the one before
      //to find the max value

    for(int n = 0; n<arr.size(); n++){
      if(arr.get(n) > max)
        max = arr.get(n);
    }
    return max;
  }

  public static void testFindMax(ArrayList<Double> list, double expected){
    double answer = findMax(list);

    System.out.print("Array list:" + list);

    System.out.println("expected max value: " + expected + "actual max value: " + answer);

    if(expected == answer)
      System.out.println("corect");
    else
      System.out.println("wrong");
  }

  public static void main(String[] args){
    ArrayList<Double> d1 = new ArrayList<Double>();
      d1.add(1.0);
      d1.add(2.1);
      d1.add(5.3);
      testFindMax(d1, 5.3);

    ArrayList<Double> d2 = new ArrayList<Double>();
      d2.add(0.0);
      d2.add(-35.0);
      d2.add(90.1);
      testFindMax(d2, 90.1);


  }
}
