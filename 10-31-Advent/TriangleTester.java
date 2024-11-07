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

  public static int countTrianglesB(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        int [][] triangles = new int[3][3];
        for (int i=0; i<3; i++){
          Scanner triangle = new Scanner(scanner.nextLine());
          for (int j=0; j<3; j++){
            triangles[i][j] = triangle.nextInt();
          }
        }
        for (int i=0; i<3; i++){
          if (isValidTriangle(triangles[0][i], triangles[1][i], triangles[2][i])){
            count++;
          }
        }
      }
      return count;
    }
    catch (FileNotFoundException e) {
    return 0;}
  }

  public static int countTrianglesAWithParseInt(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] nums = line.split(" +"); 
        int a = Integer.parseInt(nums[0]);        
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);

        if (isValidTriangle(a, b, c)) {
          count++;
        }
      }
    } catch (FileNotFoundException e) {
      return 0;
    }
    return count;
  }

  public static int countTrianglesBWithParseInt(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        int[][] triangles = new int[3][3];
        for (int i = 0; i < 3; i++) {
          String line = scanner.nextLine();
          String[] nums = line.split(" +");
          for (int j = 0; j < 3; j++) {
            triangles[i][j] = Integer.parseInt(nums[j]);
          }
        }
        for (int i = 0; i < 3; i++) {
          if (isValidTriangle(triangles[0][i], triangles[1][i], triangles[2][i])) {
            count++;
          }
        }
      }
    } catch (FileNotFoundException e) {
    System.out.println("File not found: " + filename);
    return 0;
  }
  return count;
}

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
    System.out.println(countTrianglesAWithParseInt("inputTri.txt"));
    System.out.println(countTrianglesBWithParseInt("inputTri.txt"));
  }
}
