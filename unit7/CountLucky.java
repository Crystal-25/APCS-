public class CountLucky{
  //arrays allow you to contain multiple values
  static int countLucky(int[] nums ){//[] represents arrays

    //counter - variable that holds how mnany times an event occurs
    int count = 0;
    for(int i = 0; i < nums.length; i++){

      if( nums[i] %7 == 0 || nums[i] % 10 == 7){
        count += 1;
      }
    }
    return count;

  }

  public static void testcountLucky(int[] nums, int expected){

    int result = countLucky(nums);
    System.out.print("Input: " + nums[0]);
    for(int i = 1; i < nums.length; i++)
      System.out.print(", " + nums[i]);

     System.out.println(" Expected: " + expected + " result " + result);

    if(result == expected){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
  public static void main(String[] args){

    int [] ar1 = {107, 207};
    testcountLucky(ar1, 2);

    int [] ar2 = {1, 2, 3};
    testcountLucky(ar2, 0);

    int[] ar3 = {7, 13, 17};
    testcountLucky(ar3, 2);
  }
}
