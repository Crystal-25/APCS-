class StringSplosion{
public static String stringSplosion(String str) {
  String ans = "";

  for(int i= 0; i <str.length (); i++){
    for(int j = 0; j<=i; j++)
      ans += str.charAt(j);
  }
  return ans;
}
public static void teststringSplosion(String str, String expected){
  String result = stringSplosion(str);
  System.out.println("Input: " + str + " Expected: " + expected);
  if(result ==expected)
    System.out.println("Correct");
  else
    System.out.println("Wrong");
    }
  public static void main(String[] args){
    teststringSplosion("Code", "CCoCodCode");
    teststringSplosion("abc", "aababc");
    teststringSplosion("ab", "aab");

  }
}
