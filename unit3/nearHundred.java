public class nearHundred{
  public static void main(String[] args){
    testnearhundred(93, true);
    testnearhundred(90, true);
    testnearhundred(89, false);
  }
  public static boolean nearhundred(int n) {
  if((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10))
    return true;
  else
    return false;
}
  public static void testnearhundred(int n, boolean exp){
    boolean ans = nearhundred(n);
      System.out.println("input: " + n + " exp: " + exp + " ans: " + ans);

      if (ans == exp)
        System.out.println( "correct ");
      else
        System.out.println(" wrong ");

  }
}
