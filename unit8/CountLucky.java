import java.util.ArrayList;
public class CountLucky{
  static int countLucky( ArrayList<Integer> aList){
    //aray - fixed size of elements
    //araylist - dynamic list where it resizes itself when items are addedd or removed
    //aList.get(index) = return the iten by the index
    //aList.size() = return the number of items in the arraylist

    int num = 0; //counts number of lucky numbers
    for(int i = 0; i<aList.size(); i++){
      if(aList.get(i)%7 == 0 || aList.get(i)%10 == 7)
        num = num + 1;
  }
    return num;
}
    public static void main(String[] args){

      ArrayList<Integer> arr1 = new ArrayList<Integer>();
      //add(value) adds the value to the end of the arraylist
      arr1.add(7);
      arr1.add(13);
      arr1.add(17);
      System.out.println(countLucky(arr1));

      ArrayList<Integer> arr2 = new ArrayList<Integer>();
      arr2.add(1);
      arr2.add(2);
      arr2.add(3);
      System.out.println(countLucky(arr2));

      ArrayList<Integer> arr3 = new ArrayList<Integer>();
      arr3.add(107);
      arr3.add(207);
      System.out.println(countLucky(arr3));

    }
}
