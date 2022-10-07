public class Diff21 {
  public static void main(String[] args){
    testDiff21(19, 2);
    testDiff21(10, 11);
    testDiff21(21, 0);
  }
  public static int diff21(int n){
    if (n>21){
      return 2*(n-21);
    }
    else {
      return 21-n;
    }
  }
  public static void testDiff21(int n, int exp) {
    int ans = diff21(n);

    System.out.print("n: " + n + "exp: " + exp + "ans: " + ans);

    if (ans == exp)
      System.out.println(" Correct :) ");
    else
      System.out.println(" Wrong :( ");
  }
}
