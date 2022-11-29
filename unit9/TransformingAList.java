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

    static String[] reverseAll( String[] arrS){

      String[] strArr = new String[ arrS.length]; //represents the whloe stirng

      //for loop
        //to go through every string in the array
        //for every string we go thorugh, add it to the reverse string array
      for(int i = arrS.length - 1; i >= 0; i--){
        strArr[i] = reverse( arrS[i] );

      }

      return strArr;
    }
    //return reverse string array

  public static void main (String[] args){
    System.out.println(reverse("abcd"));
    System.out.println(reverse("1234"));

    String[] as = {"abcd", "xyz"};
    String[] r = reverseAll(as);

    for(String s: r){
      System.out.println(s);
    }
  }
}
