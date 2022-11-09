public class Main{
  public static void main(String[] args){
      Person p1 = new Person("Crystal", 0);
//person 1 is a new variable is a new variable that holds many things
      System.out.println(p1.getName());
      System.out.println(p1.getNumberOfPets());
      System.out.println(p1.greetings());
//score
      ScoreKeeper s1 = new ScoreKeeper();
      System.out.println(s1.getScore());

      s1.scoreNormal();
      System.out.println(s1.getScore());

      s1.scoreBonus();
      System.out.println(s1.getScore());
//magic8
    MagicEightBall m1 = new MagicEightBall();

    System.out.println(m1.ask("Will it rain tomorrow?"));
    }
//rectangle
      Rectangle r1 = new Rectangle(5, 10);

      System.out.println(r1.getBase();
      System.out.println(r1.getHeight();
      System.out.println(r1.getArea());
      System.out.println(r1.getPerimeter());
      System.out.println(r1.getLength());


  }
