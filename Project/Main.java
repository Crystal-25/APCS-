import processing.core.*;
import java.util.*;  //import it when you use an
//arraylist or special tools

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
    if(tetrises.get(tetrises.size() - 1).groundStop()){
      createTetris();
    }

    /*for(int i = 0; i < tetrises.size(); i++){
      if(stop(tetrises.get(i))){
        createTetris();
    }
  }
  */
}

  public void draw(){

    background(0);
    drop();

    for(Tetris t: tetrises){
      t.display();
    //  t.move();

    /*  if(collision(t))
      {
        drop();

      }
      */
    }
  }

  public boolean collision(Tetris curr){

    for(Tetris t: tetrises){

      if(t.pos.x == curr.pos.x && t.pos.y > curr.pos.y){

        createTetris();
        return true;
        //make curr stay
      }
    }

    return false;
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
}
