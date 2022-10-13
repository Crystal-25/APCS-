class LoneTeen{
  public static boolean loneteen(int a, int b){
    boolean a1 = (a >= 13 && a <= 19);
    boolean b1 = (b >= 13 && b <= 19);
    return (a1 && !b1) || (!a1 && b1);
  }
  public static void testloneteen(int a, int b, boolean exp){
    boolean ans = loneteen(a, b);
    System.out.println("input: " + a + ", " + b + " exp: " + exp + " ans: " + ans);
  }
  public static void main(String[] args){
    testloneteen(13, 90, true);
    testloneteen(21, 19, true);
    testloneteen(13, 13, false);
  }
}
