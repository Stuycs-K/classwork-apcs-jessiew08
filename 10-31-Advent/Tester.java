//Amy Zhou, Jessie Wang, Axel Stahl

import java.util.Scanner;

public class Tester {

  public static void main(String[] args) {
    //scanner object 1
    Scanner sc1 = new Scanner("This is a bunch of words");

    //prints each line
    while (sc1.hasNext()) {
      System.out.println(sc1.next());
    }

    //scanner object 2
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

    //calculates the sum
    double sum = 0.0;
    while (sc2.hasNext()) {
      sum += sc2.nextDouble();
    }
    System.out.println(sum);
  }
}