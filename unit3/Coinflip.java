public class Coinflip{
  public static String coinflip(){
    //math.random: returns a value between 0 and, but not including 1
      double f = Math.random();
      if(f>0.5)
        return "heads";
      else
        return "tails";
  }
  public static void main(String[] args){
    for(int i = 0; i<=20; i++){
      System.out.println(coinflip());
    }
  }
}
