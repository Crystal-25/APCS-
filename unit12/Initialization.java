public class Initialization{
  public static void main(String[] args){
  int[][] multiples = new int [10][10];
  //[][] represents 2d array
  //1st [] = rows, 2nd [] = column

  for(int i = 0; i < multiples.length; i++){
    multiples[i][i] = 1;
  }

  for(int row = 0; row < multiples.length; row++){
    //only strings need parantesis after .length()
    for(int col = 0; col < multiples[0].length; col++){
      System.out.print(multiples[row][col] + " ");
      }
    System.out.println();
    }

//b
  String name[][] = new String[8][8];

  for(int i = 0; i<name.length; i++){
    for(int j = 0; j<name[0].length; j++){
      System.out.print(name[i][j]);
    }
    System.out.println();
    }

  //c
    double add [][] = new double[5][5];

    double count = 11.0;
    for(int i = 0; i<add.length;i++){
      for(int j = 0; j<add[0].length; j++){
        add[i][j] = count;
        count++;
      }
      count += 5;
    }

    for(int i = 0; i<add.length; i++){
      for(int j = 0; j<add[0].length; j++){
        System.out.print(add[i][j] + " ");
      }
      System.out.println();
    }

  //d
  int a[][] = new int[6][5];

  int row = 1;
  for(int i = 0; i<a.length; i++){
    for(int j = 0; j<a[i].length; j++){
        a[i][j] = i+1;
        //adds: adds the specific element to the set
        //a[1][j] = row; also works
    }
    row++; //update to add 1 every new row
  }
  for(int i = 0; i<a.length; i++){
    for(int j = 0; j<a[0].length; j++){
      System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
