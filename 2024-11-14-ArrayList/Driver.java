//Amy Zhou
//Jessie Wang
import java.util.ArrayList;
public class Driver {
  public static void main (String[] args) {
    ArrayList<String>a1;
    a1 = ArrayListPractice.createRandomArray(50);
    System.out.println(a1);
    ArrayListPractice.replaceEmpty(a1);
    System.out.println(a1);
    ArrayList<String>a2;
    a2 = ArrayListPractice.makeReversedList(a1);
    System.out.println(a2);
    ArrayList<String> a3;
    a3 = ArrayListPractice.createRandomArray(22);
    ArrayList<String> a4;
    a4 = ArrayListPractice.mixLists(a2,a3);
    System.out.println(a4);
  }
}