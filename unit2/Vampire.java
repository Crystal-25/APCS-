public class Vampire{
  public static void main(String[] args){
      System.out.println(vampire(8,true));
  }
  public static boolean vampire(float hour, boolean awake){
    if (6<= hour && hour>= 22){
      return awake == true;
    }
    else{
      return awake == false;
    }
  }
}
