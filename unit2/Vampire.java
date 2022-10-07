public class Vampire{
  public static void main(String[] args){
      testvampire(6, false, true);
      testvampire(7, true, true);
      testvampire(23, false, false);
  }
  public static boolean vampire(float hour, boolean awake){
    if (6< hour && hour> 22){
      return awake == true;
    }
    else{
      return awake == awake;
    }
  }
  public static void testvampire(float hour, boolean awake, boolean exp){
    boolean ans = vampire(hour, awake);

    System.out.println("hour: " + hour + " awake: " + awake + " exp: " + exp + " ans: " + ans);

    if (ans==exp)
      System.out.println(" correct ");
    else
      System.out.println(" wrong ");


  }
}
