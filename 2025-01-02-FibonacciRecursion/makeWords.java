public class makeWords{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters==0){
      System.out.println(result);
    }
    else{
      for (int i=0; i<alphabet.length(); i++){
        makeWords(remainingLetters-1, result+alphabet.substring(i,i+1), alphabet);
      }
    }
  }

  private String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  private String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen","seventeen", "eighteen", "nineteen"};
  private String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

  public static String toWords(int n){
    
  }

  public static void main(String[] args){
    makeWords(3, "", "abc");
  }
}
