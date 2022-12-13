import java.util.ArrayList;
//class
public class SumOfSquares {
  //method
  public static double sumOfSquares ( ArrayList<Double> aList){
    //the parameter passes what variables in your method to what you need to print out
  double total = 0;
  for(int i = 0; i<aList.size(); i++){
    double square = aList.get(i)* aList.get(i);

    total = square + total;
  }
  return total;
}

public static void testsumOfSquares(ArrayList<Double> nums, double expected){

  double result = sumOfSquares(nums);
  System.out.println("Input: " + nums.get(0));
  for(int i = 1; i<nums.size(); i++)
    System.out.println("," + nums.get(i));

    System.out.println(" expected: " + expected + " result: " + result);

    if(result == expected){
      System.out.println("correct");

    }
    else{
      System.out.println("wrong");
    }
}
 public static void main(String[] args){

   ArrayList<Double> arr1 = new ArrayList<Double>();
   arr1.add(1.0);
   arr1.add(2.0);
   arr1.add(3.0);
   System.out.println(sumOfSquares(arr1));

   ArrayList<Double> arr2 = new ArrayList<Double>();
   arr2.add(0.0);
   System.out.println(sumOfSquares(arr2));

   ArrayList<Double> arr3 = new ArrayList<Double>();
   arr3.add(2.0);
   arr3.add(2.0);
   arr3.add(2.0);
   System.out.println(sumOfSquares(arr3));

 }

}
