public class Market{
  public static boolean goodDeal(double orginialPrice, double salePrice){
    if (0.75*orginialPrice == salePrice){
      }
      return true;
  }
  public static void main(String[] args){
    System.out.println(goodDeal(100, 100));
    System.out.println(goodDeal(80, 300));
    System.out.println(goodDeal(50, 100));
  }
}
