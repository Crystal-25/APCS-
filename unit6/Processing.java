import processing.core.*;

public class Processing extends PApplet {
  int x;
  int y;
  int s;

  public void settings(){
    size(400, 400);
  }
  public void setup(){
    x = 200;
    y = 200;
    s = 200;

    background(0);
  }
  public void draw(){
    x = x+1;
    if(x>400+s/2)
    x = 0-s/2;
    //head
    strokeWeight(3);
    fill(242, 224, 59);
    ellipse(x, y, s, s);
    //eyes
    fill(0);
    ellipse(x+s/6, y-s/6, s/4, s/4);
    ellipse(x-s/6, y-s/6, s/4, s/4);
    //pupils
    stroke(255);
    fill(255);
    ellipse(x+s/8, y-s/5, s/8, s/8);
    ellipse(x-s/8, y-s/5, s/8, s/8);

    //mouth
    strokeWeight(3);
    noFill();
    stroke(0);
    arc(x, y+s/12, s/2, s/2, 0, PI);
    line(x-s/4, y+s/12, x+s/4, y+s/12);
    }

    public static void main(String[] args)
    {
      PApplet.main("Processing");
    }
  }
