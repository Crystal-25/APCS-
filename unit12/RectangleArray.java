import java.util.*;
public class RectangleArray{

  static double averagePerimeter(Rectangle[][] arr){

    int count = 0;
    double sum = 0;

    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){

        if(arr[i][j] != null){
        sum += arr[i][j].getPerimeter();
        count++;
        }
      }
    }
    return sum/count;
  }

  static Rectangle greatestArea(Rectangle[][] arr){
    //arr is the whole 2d array
    Rectangle result = new Rectangle("rectangle ", 0, 0);
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[i].length; j++){

        if(arr[i][j] != null){
          if(arr[i][j].getArea()> result.getArea())
          result = arr[i][j];
        }
      }
    }
    return result;
}

  public static void main(String[] args){
    Rectangle[][] rects = new Rectangle[15][15];

    rects[0][1] = new Rectangle("test 1", 8, 3);
    rects[2][2] = new Rectangle("test 2", 3, 1);
    rects[3][4] = new Rectangle("test 3", 10, 5.5);
    rects[1][9] = new Rectangle("test 4", 2, 6);
    rects[8][4] = new Rectangle("test 5", 7, 5);
    rects[9][10] = new Rectangle("test 6", 16, 7);

    Rectangle gr = greatestArea(rects);
    System.out.println(gr.getName() + " " + gr.getWidth()
    + " " + gr.getHeight());
    System.out.println(averagePerimeter(rects));
  }
}
