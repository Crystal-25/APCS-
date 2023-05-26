import processing.core.*;
import java.util.*;  //import it when you use an
//arraylist or special tools
//import Tetris;

public class Main extends PApplet{

  ArrayList<Tetris> tetrises;
  Tetris curr;

  public void settings(){

    fullScreen();

  }
  public void setup(){

    tetrises = new ArrayList<Tetris>();
    createTetris();

  }

  public void createTetris(){

    Tetris t = new Tetris(this);
    tetrises.add(t);

  }

  public void drop()
  {
    if(tetrises.get(tetrises.size() - 1).groundStop(collisionL)){
      createTetris();
      collisionL += tetrises.get(tetrises.size() - 1).getIncrement();
    }
}

  public void draw(){

    background(0);
    drop();

    for(Tetris t: tetrises){
      t.display();
    }
  }


  public void keyPressed(){

    System.out.println("");

    for(Tetris t: tetrises){

        if(t.getSele() == true){
          if(keyCode == LEFT)
            t.moveLeft();

          else if(keyCode == RIGHT)
            t.moveRight();

          else if(keyCode == DOWN)
            t.moveDown();
          }
      }
  }

public static void main(String[] args){
  PApplet.main("Main");
}

  public int collisionL = 0;

}
