public class StringTimes{
  public String StringTimes(String str, int n) {
  String result = "";
  for(int i = 1; i<=n; i++){
    result = result + str;
  }
  return result;
  }
  public static void teststringTimes(String str, int n, String exp){
    String ans = exp;

    System.out.println("input: " + str + " , " + n + " exp: " + exp + " ans: " + ans);

    if (ans == exp)
      System.out.println ("correct");
    else
      System.out.println ("wrong");
  }
  public static void main(String[] args){
    teststringTimes("Hi", 3, "HiHiHi");
    teststringTimes("Hi", 1, "Hi");
    teststringTimes("Hi", 2, "HiHi");

  }
}
