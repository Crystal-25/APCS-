public class FibonacciSequence {
  public static void main(String[] args){
    int a = 0;
    int b = 1;
    for (int n = 1; n <=30; n++){
      System.out.println(a+b);
        if(a<=b){
          a=a+b;
        } else if (b<a){
          b=a+b;
        }
      }
    }
  }
