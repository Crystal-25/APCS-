public class FibonacciSequencePractice{
  public static void main(String[] args){
    int a = 0;
    int b = 1;
    for (int sum = a+b; a++){
      System.out.println(sum);
      a = b;
      b = sum; 
    }
  }
}
