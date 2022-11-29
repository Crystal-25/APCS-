public class SumOfSquares{
  static double sumOfSquares(double[] nums){

    int count = 0;
    for(int i = 0; i <nums.length; i++){
      double square = nums[i] * nums[i];

      count += square;
    }
    return count;
  }

  public static void main(String[] args){
    double[] arr = {0};
    System.out.println(sumOfSquares(arr));

    double[] arr2 = {1.0, 2.0, 3.0};
    System.out.println(sumOfSquares(arr2));

    double[] arr3 = {2.0, 2.0, 2.0};
    System.out.println(sumOfSquares(arr3));
  }
}
