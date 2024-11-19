import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BathroomCode {
  public static void bathroomCode(String filename) {
    int[][] keypad = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

    int x = 1; 
    int y = 1; 

    try (Scanner fileScanner = new Scanner(new File(filename))) {
      while (fileScanner.hasNextLine()) {
        String instructions = fileScanner.nextLine();
        for (int i = 0; i < instructions.length(); i++) {
          char move = instructions.charAt(i);

          if (move == 'U') {
            if (y > 0) y--; 
          } else if (move == 'D') {
            if (y < 2) y++; 
          } else if (move == 'L') {
            if (x > 0) x--; 
          } else if (move == 'R') {
            if (x < 2) x++; 
          }
        }

        System.out.print(keypad[y][x]);
      }

      System.out.println();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
    }
  }


  public static void main(String[] args) {
    String filename = "instructions.txt"; 

    bathroomCode(filename);
  }
}
