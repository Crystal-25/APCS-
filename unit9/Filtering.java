import java.util.*;
public class Filtering{
          //return type      //method
  public static ArrayList<Integer> filterGoodScores( ArrayList<Integer> scores){

    ArrayList<Integer> score90 = new ArrayList<Integer>();

    for(int i = 0; i<scores.size(); i++){
    //size - # of elements
    //str.length() - return the number of characters in the string
    //arr.length() - return the number of elements in the array
    if(scores.get(i)>90)
      score90.add(scores.get(i));
    }
    return score90;
  }

public static void testfilterGoodScores(ArrayList<Integer> list, ArrayList<Integer>expected){
  ArrayList<Integer> answer = filterGoodScores(list);

  System.out.print("Array list: " + list);

  System.out.println("expected: " + expected + "actual value: " + answer);

  if(expected.equals (answer))
    System.out.println("correct");
  else
    System.out.println("wrong");
}

public static void main(String[] args){
    ArrayList<Integer> arr1 = new ArrayList<Integer>();

    ArrayList<Integer> exp1 = new ArrayList<Integer> ();
    exp1.add (100);

    arr1.add(51);
    arr1.add(52);
    arr1.add(53);
    arr1.add(100);

    testfilterGoodScores(arr1, exp1);

    ArrayList<Integer> arr2 = new ArrayList<Integer>();

    ArrayList<Integer> exp2 = new ArrayList<Integer>();
    exp2.add(92);
    exp2.add(99); 

    arr2.add(92);
    arr2.add(89);
    arr2.add(90);
    arr2.add(99);

    testfilterGoodScores(arr2, exp2);
  }
}
