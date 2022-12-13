public class SumOfSquares{
  static double sumOfSquares(double[] nums){

    int count = 0;
    for(int i = 0; i <nums.length; i++){
      double square = nums[i] * nums[i];

      count += square;
    }
    return count;
  }
  public static void testsumOfSquares(double[] nums, double expected){

    double result = sumOfSquares(nums);
    System.out.print("Input: " + nums[0]);
    for(int i = 1; i<nums.length; i++)
      System.out.print("," + nums[i]);

    System.out.println(" Expected: " + expected + " result " + result);

    if(result == expected){
      System.out.println("correct");
    }
    else{
      System.out.println("wrong");
    }
  }

  public static void main(String[] args){

    double [] d1 = {0};
    testsumOfSquares(d1, 0);

    double[] d2 = {1.0, 2.0, 3.0};
    testsumOfSquares(d2, 14.0);

    double[] d3 = {2.0, 2.0, 2.0};
    testsumOfSquares(d3, 12.0);
  }
}
