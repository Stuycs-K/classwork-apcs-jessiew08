//under 10 sec: 46
//largest n: 46

public class fib{
  public static int fib(int n){
    if (n<2){
      return n;
    }
    else{
      return fib(n-1)+fib(n-2);
    }
  }

  public static void main(String[] args){
    System.out.println(fib(46));
  }
}
