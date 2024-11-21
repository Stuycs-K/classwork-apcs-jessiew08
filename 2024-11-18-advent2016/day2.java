import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2{
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

  public static void part2(String filename) {
    char[][] keypad = {{' ', ' ', '1', ' ', ' '},{' ', '2', '3', '4', ' '},{'5', '6', '7', '8', '9'},{' ', 'A', 'B', 'C', ' '},{' ', ' ', 'D', ' ', ' '}};
    int x = 0; 
    int y = 2;
    
    try (Scanner fileScanner = new Scanner(new File(filename))) {
      while (fileScanner.hasNextLine()) {
        String instructions = fileScanner.nextLine();
        for (int i = 0; i < instructions.length(); i++) {
          char move = instructions.charAt(i);

          if (move == 'U') {
            if (x > 0 && keypad[x - 1][y] != ' ') {
              x--;
            }
          } else if (move == 'D') {
            if (x < 4 && keypad[x + 1][y] != ' ') {
              x++;
            }
          } else if (move == 'L') {
            if (y > 0 && keypad[x][y - 1] != ' '){
              y--;
            } 
          } else if (move == 'R') {
            if (y < 4 && keypad[x][y + 1] != ' ') {
              y++;
            } 
          }
        }

        System.out.print(keypad[x][y]);
      }

      System.out.println(); 
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
    }
  }


  public static void main(String[] args) {
    String filename = "instructions.txt"; 
    part2(filename);
  }
}
