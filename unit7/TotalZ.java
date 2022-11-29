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
  public static void main(String[] args){

    String[] arr = {"Dr. Kessner", "Dr. Sands"};
    System.out.println(countZNames(arr));

    String[] arr2 = {"Zorro", "zero", "zippy"};
    System.out.println(countZNames(arr2));
  }
}
