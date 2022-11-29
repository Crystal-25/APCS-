public class MaximumValue{
  static double findMax(double[] arr){

    double max = arr[0];
      //arr[] goes through every index in the element and compares to the one before
      //to find the max value

    for(int n = 0; n<arr.length; n++){
      if(arr[n] > max)
        max = arr[n];
    }
    return max;
  }
  public static void main(String[] args){

    double[] arrayD = {1.0, 2.1, 5.3};
      System.out.println( findMax(arrayD));
    
  }
}
