import java.util.ArrayList;
public class TotalZLength{
  static int totalZLength(ArrayList<String> aList){
  int total = 0; //total length of strings that start with with z or Z

  for(int i = 0; i<aList.size(); i++){
  //int i helps us go through every element

    if(aList.get(i).charAt(0) == 'z' || aList.get(i).charAt(0) == 'Z') //characters can be stored in single '' marks
    //char.At returns a character from the string by plugging in an index
        total = aList.get(i).length() + total;
        //get() returns item in its index
  }
  return total;
  }

  public static void testtotalZLength(ArrayList<String> nums, int expected){

    int result = totalZLength(nums);
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

    ArrayList<String> arr1 = new ArrayList<String> ();
    arr1.add("Dr. Kessner");
    arr1.add("Dr. Sands");
    System.out.println(totalZLength(arr1));

    ArrayList<String> arr2 = new ArrayList<String> ();
    arr2.add("Zorro");
    arr2.add("zero");
    arr2.add("zippy");
    System.out.println(totalZLength(arr2));
  }
}
