public class Animal{

  private String name; //instance variables
  private int legCount;
  private boolean furrines;

  public Animal(String name, int legCount, boolean furrines){

    this.name = name;
    this.legCount = legCount;
    this.furrines = furrines;
  }

  public String getName(){ //often times accessors starts with get, but in this
    //case you don't
          // getter returns the value of an instance variable
    return name;
  }

  public int getlegCount(){
    return legCount;
  }

  public boolean getFurrines(){
    return furrines;

    }
  }
