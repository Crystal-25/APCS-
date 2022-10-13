public class Market{
  public static boolean goodDeal(double orginalPrice, double salePrice){
    if (0.75*orginalPrice < salePrice){
      }
      return true;

  }
  public static void testgoodDeal(double orginalPrice, double salePrice, boolean ans, boolean exp){
    ans = goodDeal(orginalPrice, salePrice);

    System.out.println("orginalPrice: " + orginalPrice + " salePrice: " + salePrice + " ans: " + ans + " exp: " + exp);

    if(ans == exp)
      System.out.println(" correct ");
    else
      System.out.println(" wrong ");
  }
  public static void main(String[] args){
    testgoodDeal(100, 50, true, true);
    testgoodDeal(300, 80, true, true);
    testgoodDeal(300, 200, true, true);
  }
}
