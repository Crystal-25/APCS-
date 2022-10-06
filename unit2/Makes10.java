public class Makes10{
  public static void main(String[] args){
    testmakes10();
    }
  public static boolean makes10(int a, int b) {
  if (a == 10 || a + b == 10 || b == 10){
    return true;
  }
  else {
    return false;
    }
  }
  public static void testmakes10(){
    System.out.println(makes10(9, 9));
    System.out.println(makes10(9,1));
  }

}
