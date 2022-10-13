public class Greetings{
  public static String greetings(String name){
    return("how are you " + name + "?");

  }
  public static void testgreetings(String name, String exp){
    String result = greetings(name);
      System.out.println("input: " + name + " result: " + result + " exp: " + exp);


      if (result.equals(exp))
        System.out.println("OK!");
      else
        System.out.println("bad");
  }
  public static void main(String[] args){
    testgreetings("Crystal", "how are you Crystal?");
    testgreetings("Cat", "how are you Cat?");
    testgreetings("Kailyn", "how are you Kailyn?"); 
    }
}
