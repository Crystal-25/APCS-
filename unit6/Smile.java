import processing.core.*;

public class Smile {

  private PApplet p;
  private int x, y, s;

Smile(PApplet p){
  this.p = p;
  x = (int)p.random(p.width);
  y = (int)p.random(p.height);
  s = (int)p.random(p.height);

  }

void update(){
  x = x+10;
  if(x>400+s/2){
  x = 0-s/2;
  }
}

void display(){
    //head
    p.strokeWeight(3);
    p.fill(242, 224, 59);
    p.ellipse(x, y, s, s);
    //eyes
    p.fill(0);
    p.ellipse(x+s/6, y-s/6, s/4, s/4);
    p.ellipse(x-s/6, y-s/6, s/4, s/4);
    //pupils
    p.stroke(255);
    p.fill(255);
    p.ellipse(x+s/8, y-s/5, s/8, s/8);
    p.ellipse(x-s/8, y-s/5, s/8, s/8);

    //mouth
    p.strokeWeight(3);
    p.noFill();
    p.stroke(0);
    p.arc(x, y+s/12, s/2, s/2, 0, p.PI);
    p.line(x-s/4, y+s/12, x+s/4, y+s/12);

  }

}
