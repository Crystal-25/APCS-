public class Shape{
  private String name;
  private int nofsides;

  public Shape(String name, int nofsides){
    //constructor name is ALWAYS the same as class name
    this.name = name;
    this.nofsides = nofsides;

  }

  public String getName(){
    return name;
  }

  public int getnOfsides(){
    return nofsides;
  }
}
