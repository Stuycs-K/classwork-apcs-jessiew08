import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  private static boolean isValidTriangle(int a, int b, int c){
    return (a + b > c) && (a + c > b) && (b + c > a);
  }


  public static int countTrianglesA(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextInt()) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (isValidTriangle(a, b, c)) {
          count++;
        }
        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }
      }
    } catch (FileNotFoundException e) {
      return 0;
    }
    return count;
  }



  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
    