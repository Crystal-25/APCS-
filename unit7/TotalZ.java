public class TotalZ{
  static int countZNames(String[] arrS){
    int total = 0; //total length of strings that start with with z or Z

    for(int i = 0; i<arrS.length; i++){
    //int i helps us go through every element

      if(arrS[i].charAt(0) == 'z' || arrS[i].charAt(0) == 'Z') //characters can be stored in single '' marks
      //char.At returns a character from the string by plugging in an index
          total = arrS[i].length() + total;
    }
  return total;
  }
  public static void testcountZNames(String[] arrS, int expected){

    int result = countZNames(arrS);
    System.out.print("Input: " + arrS[0]);
    for(int i = 1; i<arrS.length; i++)
      System.out.print("," + arrS[i]);

      System.out.println( " Expected " + expected + " result" + result);

      if(result == expected){
        System.out.println("correct");
      }
      else{
        System.out.println("wrong");
      }
  }
  public static void main(String[] args){

    String[] s1 = {"Dr. Kessner", "Dr. Sands"};
    testcountZNames(s1, 0);

    String[] s2 = {"Zorro", "zero", "zippy"};
    testcountZNames(s2, 14);
  }
}
