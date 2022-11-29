public class Sequence{
  static int[] fibonacci (int n){

    //create an array of integers that will hold the sequence
    int[] aList = new int[n];

    if ( n >= 1){
      aList[0] = 1;
    }
    if( n>= 2){
        aList[1] = 1;
    }
    for(int i = 2; i<n; i++){
      aList[i] = aList[i-1] + aList[i-2];
    }
    return aList;
  }
  public static void main (String[] args){
    int [] r = fibonacci(2);
    for( int num: r){
      System.out.println("fib 2: " + num);
    }

    int [] r2 = fibonacci(3);
    for( int num: r2){
      System.out.println("fib 3: " + num);
    }

    int [] r3 = fibonacci(5);
    for( int num: r3){
      System.out.println("fib 5: " + num);
    }
  }
}
