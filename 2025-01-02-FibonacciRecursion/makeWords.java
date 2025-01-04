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

  private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen","seventeen", "eighteen", "nineteen"};
  private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

  private static String convert(int n) {
    if (n < 10) {
      return ones[n];
    }
    if (n < 20) {
      return teens[n - 10];
    }
    if (n < 100) {
      String result = tens[n / 10];
      if (n % 10 != 0) {
        result += " " + ones[n % 10];
      }
      return result;
    }
    if (n < 1000) {
      String result = ones[n / 100] + " hundred";
      if (n % 100 != 0) {
        result += " and " + convert(n % 100);
      }
      return result;
    }
    if (n < 1000000) {
      String result = convert(n / 1000) + " thousand";
      if (n % 1000 != 0) {
        result += " " + convert(n % 1000);
      }
      return result;
    }
    return "out of range";
  }

  public static String toWords(int n){
    if (n == 0) {
      return "zero";
    }
    if (n < 0) {
      return "negative " + toWords(-n);
    }
    return convert(n);
  }

  public static void main(String[] args){
    //makeWords(3, "", "abc");
    System.out.println(toWords(14));
    System.out.println(toWords(94));
    System.out.println(toWords(342));
    System.out.println(toWords(115));
    System.out.println(toWords(999999));
  }
}
