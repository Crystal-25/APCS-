import java.util.*;
public class TransformingAList{
  static String reverse(String s){
    //create a variable
    String str = ""; //this goes through every character from the string right to left
    //Every character you go thorugh, we would add it to the variable
    for(int i = s.length() - 1 ; i >= 0; i--){
      //s.length - 1 is the last point bc we're doing the reverse
      //i >= 0 because i have to go to zero, which is the 1st index
        str += s.substring(i, i+1);
        //substring(start, end) = range of characters

    }
    return str;
    //return reverse string
  }

    static ArrayList<String> reverseAll(ArrayList<String> arrS){

      ArrayList<String> strArr = new ArrayList<String>(); //represents the whloe stirng

      //for loop
        //to go through every string in the array
        //for every string we go thorugh, add it to the reverse string array
      for(int i = arrS.size() - 1; i >= 0; i--){
        strArr.add(reverse( arrS.get(i) ));

      }

      return strArr;
    }
    //return reverse string array
  public static void testreverse(ArrayList<String> list, ArrayList<String> expected){
      ArrayList<String> answer = expected;

      System.out.print("Array list:" + list);

      System.out.println("expected max value: " + expected + "actual max value: " + answer);

      if(expected.equals(answer))
        System.out.println("corect");
      else
        System.out.println("wrong");
    }

  public static void main (String[] args){

    System.out.println(reverse("abcd"));
    System.out.println(reverse("1234"));

    ArrayList<String> as = new ArrayList<String> ();
      as.add("abcd");
      as.add("xyz");

    ArrayList<String> r = new ArrayList<String> ();
      r.add("dcba");
      r.add("zyx");

    testreverse(as, r);


    }
  }
