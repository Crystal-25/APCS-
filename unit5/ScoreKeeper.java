public class ScoreKeeper{
  private int score;
  public ScoreKeeper(){
    score = 0;
  }

  void scoreNormal(){
    //void returns nothing
    score = score + 100;
  }

  void scoreBonus(){
    score += 1000; //another way to write it
    }

  int getScore(){ //nothing in the paranateses bc there are no parameters
      //parameters are
      return score;
      //this only returns score
    }
  }

  //constricur sets value for variable
  //accessor returns value for your variable
