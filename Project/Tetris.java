import processing.core.*;

public class Tetris{

  private PApplet p;
  public PVector pos;
  private boolean sele;
  private String diffshape;

  private int x;
  private int y;
  private int speed;

  public boolean getSele(){
    return sele;
  }

  public Tetris(PApplet p){

    this.p = p;
    //this.diffshape = diffshape;
    pos = new PVector(p.width/2, 0);

    sele = true;

    float f = p.random(4);

    if(f < 1)
      diffshape = "line";
    else if(f < 2)
      diffshape = "twist";
    else if(f < 3)
      diffshape = "L";
    else if(f < 4)
      diffshape = "square";

  }

  //public void move(){
    //pos.y += 2;
  // if(pos.y > p.height - 200)
  //  pos.y = p.height - 200;

  //}

  public boolean groundStop(){

  if(diffshape.equals("square") && pos.y > p.height - 50){
      pos.y = p.height - 50;
        sele = false;
        return true;
    }

    if(diffshape.equals("line") && pos.y + 150 > p.height - 200){
        pos.y = p.height;
          sele = false;
          return true;
      }

    if(diffshape.equals("twist") && pos.y > p.height - 200){
          pos.y = p.height;
            sele = false;
            return true;
        }

    if(diffshape.equals("L") && pos.y > p.height - 250){
            pos.y = p.height;
              sele = false;
              return true;
      }

    return false;
  }


  public void display(){
    p.fill(255);
    //p.rect(pos.x, pos.y, 50, 50);
    //x = x + speed;

    //if( x >= p.width || x<=0)

    if( diffshape.equals("square")){
      p.rect(pos.x, pos.y, 100, 100);
    }

    if( diffshape.equals("line")){
      p.rect(pos.x, pos.y, 50, 200);
    }

    if( diffshape.equals("twist")){
      p.rect(pos.x, pos.y, 50, 100);
      p.rect(pos.x + 50, pos.y + 50, 50, 100);
    }

    if( diffshape.equals("L")){
      p.rect(pos.x, pos.y, 50, 150);
      p.rect(pos.x + 50, pos.y + 50, 50, 50);
    }
  }

  public void moveLeft(){
    pos.x -= 50;
  }

  public void moveRight(){
    pos.x += 50;
  }

  public void moveDown(){
    pos.y += 50;
  }

  Tetris(int x, int y, int speed){
    this.x = x;
    this.y = y;
    this.speed = speed;
    //this.moveLeft = moveLeft;
  }

}
