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
  public static void main(String[] args){

    int[] arr = {107, 207};

    System.out.println(countLucky(arr));

    int[] arr2 = {1, 2, 3};
    System.out.println(countLucky(arr2));

    int[] arr3 = {7, 13, 17};
    System.out.println(countLucky(arr3));

    /* System.out.println(countLucky({1, 2, 3}));
    System.out.println(countLucky({7, 13, 17}));
    System.out.println(countLucky({107, 207}));
      */
  }
}
