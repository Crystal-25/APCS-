public class Attention{
  public static boolean attention(String input){
    String location = input.substring(0, 8);//where "hey you" is located
    //Sub String searches for where the location is located
      if(location.equals("Hey you!"))//.equls is only for strings
        return true;
      else
        return false;
    }
  public static void testattention(String input, boolean exp){
    boolean ans = attention(input);

    System.out.println("input: " + input + " exp: " + exp +
    " ans: " + ans);

    if(ans==exp;)
      System.out.println(" correct ");
    else
      System.out.println( "wrong ");
  }
  public static void main(String[] args){
    testattention("Hey you! Pay attention", true);
    testattention("good morning", false);
    testattention("Hey you! wake up", true); 
  }

}
