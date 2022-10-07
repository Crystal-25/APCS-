public class Makes10{
  public static void main(String[] args){
    testmakes10(20, 10, true);
    testmakes10(9, 8, false);
    testmakes10(10, 12, true);
    }
  public static boolean makes10(int a, int b) {
  if (a == 10 || a + b == 10 || b == 10){
    return true;
  }
  else {
    return false;
    }
  }
  public static void testmakes10(int a, int b, boolean exp){
    //exp means excepted, it is what we think it output is
    boolean ans = makes10(a, b);

    System.out.println("a: " + a + " " + " b: " + b + " exp: " + exp + " ans:" + ans);

    if (ans == exp)
      System.out.println(" correct ");
    else
      System.out.println(" wrong ");
      //you don't need curly brackets because it is only a single statement
    }
  }
