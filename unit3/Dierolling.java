public class Dierolling{
  public static int dieRolling(){
    return (int)(Math.random() * 6 + 1);
  }
  public static void main(String[] args){
    for (int i = 0; i<20; i++)
      System.out.println(dieRolling());
      //you don't need a bracket after for loop bc there's only 1 line after it
  }
}
