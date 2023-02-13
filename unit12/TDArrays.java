public class TDArrays{
  //a
  static int getSmallest(int[][] arr){
    //static belongs to the class, I won't be able to call the method unless
    //I create an object
    int smallest = arr[0][0];

    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){
        if(arr[i][j]<smallest)
        smallest = arr[i][j];
      }
    }
    return smallest;
  }

  //b
  static float sum2dArray( float [][] arr ){
                        //takes in float 2d array
    float sum = 0f;
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){
      sum += arr[i][j];
    }
  }
    return sum;
  }

  //c
  static int countA( String [][] arr ){

    int count = 0;
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){
        if(arr[i][j].charAt(0) == 'A')
        //charAt returns a specified index in a string
          count++;
      }
    }
      return count;
    }

  public static void main(String[] args){

    int[][] test1 = {{2, 9, -4}, {3, -10, -2}};
    float[][] test2 = {{2f, 9f, -4f}, {3f, 10f, -2f}};
    String[][] test3 = {{"Are", "about", "At"}, {"before", "After", "after"}};

  //smallest
    for(int i = 0; i<test1.length; i++){
      for(int j = 0; j<test1[i].length; j++){
        System.out.print(test1[i][j] + " ");
      }
      System.out.println();
    }
  System.out.println(getSmallest(test1));

  //sum
  for(int i = 0; i<test2.length; i++){
    for(int j = 0; j<test2[i].length; j++){
      System.out.println(test2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(sum2dArray(test2));

  //countA
  for(int i = 0; i<test3.length; i++){
    for(int j = 0; j<test3[i].length; j++){
      System.out.print(test3[i][j] + " ");
    }
    System.out.println();
  }
  System.out.println(countA(test3));
  }
}
