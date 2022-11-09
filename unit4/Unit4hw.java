class Unit4hw{
public static int sumOfSquares(int n){
    int result = 0;
    for (int i=1; i<=n; i++){
      result = result + i*i;
    }
    return result;
}
public static void testsumOfSquares(int n, int expected){
  int result = sumOfSquares(n);
  System.out.println("Input: " + n + " Expected: " + expected);
  if(result == expected)
     System.out.println("Correct");
  else
    System.out.println("Wrong");
}
public static void main(String[] args){
  testsumOfSquares(1, 1);
  testsumOfSquares(2, 5);
  testsumOfSquares(3, 14);

  testcountOccurences("Mississippi", "iss", 2);
  testcountOccurences("bananananana", "na", 5);
  testcountOccurences("morninging", "ing", 2);

  testfactorial(0, 1);
  testfactorial(1, 1);
  testfactorial(3, 6);

  testreverse("bad", "dab");
  testreverse("Hello, world!", "!dlrow ,olleH");
  testreverse("tacocat", "tacocat");
}

//countOccurences
public static int countOccurences(String word, String occ){
  int count = 0;
  for(int i = 0; i<word.length()- occ.length() + 1; i++){
      if(word.substring(i, i + occ.length()).equals(occ))
        count++;
      }
      return count;
  }
public static void testcountOccurences(String word, String occ, int expected){
    int result = countOccurences(word, occ);
    System.out.println("input: " + word + " occurecnes: " + occ + " expected: " + expected);

    if(result == expected)
      System.out.println("Correct");
    else
      System.out.println("Wrong");
  }

//reverse
public static String reverse(String str){
  String result = "";
  for(int i = str.length()-1; i>=0; i--){
    result += str.charAt(i);
    }
    return result;
}
public static void testreverse(String str, String exp){
  String result = reverse(str);
  System.out.println("input: " + str + " exp: " + exp);

  if(result.equals(exp))
    System.out.println("corect");
  else
    System.out.println("wrong");
}

//factorial
public static int factorial(int i){
    int result = 1;
    for(int n = i; n>0; n--){
      result = result*i;
    }
    return result;
  }
public static void testfactorial(int n, int expected){
    int result = factorial(n);
      System.out.println("intput: " + n + " expected: " + expected);
    if(expected == result)
      System.out.println("correct");
    else
      System.out.println("wrong");
  }

}
