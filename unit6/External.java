
import processing.core.*;
import java.util.*;

public class External extends PApplet{

private ArrayList<Smile> smiles;

  public void settings(){
    size(400, 400);
  }

  public void setup(){

    smiles = new ArrayList<Smile>();

    for(int i = 0; i<50; i++){
      Smile s;
      s = new Smile(this);
      smiles.add(s);
    }
  }

  public void draw(){
    background(0);

    for(Smile s:smiles){
      s.update();
      s.display();
    }
  }

  public static void main(String[] args){
    PApplet.main("External");
  }

}
