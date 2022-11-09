class MagicEightBall{
  private final String reply1 = "yes"; //0
  private final String reply2 = "np problem"; //1
  private final String reply3 = "ur welcome"; //2

  String ask(String s1){

     int r = (int)(Math.random()*3); //returns value 0<=x>1

     if(r==0){
       return reply1;
     }
     else if(r==1){
       return reply2;
     }
     else{
       return reply3;
     }
  }
}
