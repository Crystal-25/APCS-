class Rectangle{
  //private member variables
  private double base;
  private double height;
  //constructor
  public Rectangle(double base, double height){

  }
  //member functions
  double getBase(){
    return base;
  }
  double getHeight(){
    return height;
  }
  double getArea(){
    return base*height;
  }
  double getPerimeter(){
    return (2*base) + (2*height);
  }
  double getLength(){
    return Math.sqrt((base*base)+(height*height));
  }
}
