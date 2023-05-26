import processing.core.*;
import java.util.*;

public class Tetris{

  private PApplet p;
  public PVector pos;
  private boolean sele;
  private String diffshape = "";

  private int x;
  private int y;
  private int speed;


  private Board board;

  public boolean getSele(){
    return sele;
  }

  public Tetris(PApplet p){

    this.p = p;
    this.board = board;
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
  public boolean groundStop(int collisionL){

  if(diffshape.equals("square") && pos.y > p.height - collisionL - 100){
      pos.y = p.height - 100-collisionL;
        sele = false;
        return true;
    }

    if(diffshape.equals("line") && pos.y > p.height - collisionL - 200){
        pos.y = p.height - 180-collisionL;
          sele = false;
          return true;
      }

    if(diffshape.equals("twist") && pos.y > p.height - collisionL - 200){
          pos.y = p.height - 150-collisionL;
            sele = false;
            return true;
        }

    if(diffshape.equals("L") && pos.y > p.height - collisionL- 250){
            pos.y = p.height - 150-collisionL;
              sele = false;
              return true;
      }

    return false;
  }

  public int getIncrement(){ //returns how tall the shape is
    if(diffshape.equals("square")){return 80;}
    else if(diffshape.equals("line")){return 150;}
  else   if(diffshape.equals("twist")){return 120;}
    else if(diffshape.equals("L")){return 120;}
    return 0;
  }
/*
  public boolean collisionDetection(){

      int boardWidth = board.getWidth();
      int boardHeight = board.getHeight();
      int xPos = (int)(pos.x / 50);
      int yPos = (int)(pos.y / 50);

      if (diffshape.equals("square")) {
        if (board.getOccupied(xPos, yPos) || board.getOccupied(xPos + 1, yPos) ||
            board.getOccupied(xPos, yPos + 1) || board.getOccupied(xPos + 1, yPos + 1)) {
          return true;
        }
      }

      if (diffshape.equals("line")) {
        if (board.getOccupied(xPos, yPos) || board.getOccupied(xPos, yPos + 1) ||
            board.getOccupied(xPos, yPos + 2) || board.getOccupied(xPos, yPos + 3)) {
          return true;
        }
      }

      if (diffshape.equals("twist")) {
        if (board.getOccupied(xPos, yPos) || board.getOccupied(xPos, yPos + 1) ||
            board.getOccupied(xPos + 1, yPos + 1) || board.getOccupied(xPos + 2, yPos + 1)) {
          return true;
        }
      }

      if (diffshape.equals("L")) {
        if (board.getOccupied(xPos, yPos) || board.getOccupied(xPos + 30, yPos) ||
            board.getOccupied(xPos + 2, yPos) || board.getOccupied(xPos + 2, yPos + 1)) {
          return true;
        }
      }

      return false;
  }
  */

  public void display(){
    p.fill(255);


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
