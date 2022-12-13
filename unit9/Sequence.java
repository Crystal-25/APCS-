import java.util.*;
public class Sequence{
  static ArrayList<Integer> fibonacci (int n){

    ArrayList<Integer> aList = new ArrayList<Integer>();

    if ( n >= 1){
      aList.add(1);
    }
    if( n>= 2){
        aList.add(1);
    }
    for(int i = 2; i<n; i++){
      aList.add(aList.get(i-1) + aList.get(i-2));
    }
    return aList;
  }

  public static void testfibonacci(int n, ArrayList<Integer> expected){
    ArrayList<Integer> actual = expected;

    System.out.print("# of terms: " + n);

    System.out.println("expected fibonacci sequence: " + expected + "actual fibonacci sequence: "
                      + actual);

    if(expected.equals(actual))
      System.out.println("Yes");
    else
      System.out.println("no");
  }

  public static void main (String[] args){
    int n = 2;
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(1);
    testfibonacci(n, list1);

    n = 3;
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(1);
    list2.add(1);
    list2.add(2);
    testfibonacci(n, list2);

    n = 4;
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    list3.add(1);
    list3.add(1);
    list3.add(2);
    list3.add(3);
    testfibonacci(n, list3);

    n = 5;
    ArrayList<Integer> list4 = new ArrayList<Integer>();
    list4.add(1);
    list4.add(1);
    list4.add(2);
    list4.add(3);
    list4.add(5);
    testfibonacci(n, list4);
  }
}
