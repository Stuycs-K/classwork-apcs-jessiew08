import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
  public static int countBlocks(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        String[] instructions = line.split(",\\s*");

        int x = 0;
        int y = 0;
        int direction = 0; 

        for (int i = 0; i < instructions.length; i++) {
          String instr = instructions[i];
          char turn = instr.charAt(0);
          int distance = Integer.parseInt(instr.substring(1));

          if (turn == 'R') {
            direction = (direction + 1) % 4;
          } else if (turn == 'L') {
            direction = (direction + 3) % 4;
          }

          if (direction == 0) {
            y += distance;
          } else if (direction == 1) {
            x += distance;
          } else if (direction == 2) {
            y -= distance;
          } else if (direction == 3) {
            x -= distance;
          }
        }

        count = Math.abs(x) + Math.abs(y);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
    }

    return count;
  }

  public static int part2(String filename) {
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        String[] instructions = line.split(",\\s*");

        int x = 0;
        int y = 0;
        int direction = 0;

        int[] visitedX = new int[1];
        int[] visitedY = new int[1];
        int visitCount = 1;

        visitedX[0] = x;
        visitedY[0] = y;
        for (int i = 0; i < instructions.length; i++) {
          String instr = instructions[i];
          char turn = instr.charAt(0);
          int distance = Integer.parseInt(instr.substring(1));

          if (turn == 'R') {
            direction = (direction + 1) % 4;
          } else if (turn == 'L') {
            direction = (direction + 3) % 4;
          }

          for (int step = 0; step < distance; step++) {
            if (direction == 0) {
              y++;
            }
            else if (direction == 1){
              x++;
            }
            else if (direction == 2) {
              y--;
            }
            else if (direction == 3) {
              x--;
            }
            for (int j = 0; j < visitCount; j++) {
              if (visitedX[j] == x && visitedY[j] == y) {
                return Math.abs(x) + Math.abs(y);
              }
            }
            if (visitCount == visitedX.length) {
              int[] newVisitedX = new int[visitedX.length * 2];
              int[] newVisitedY = new int[visitedY.length * 2];
              for (int k = 0; k < visitedX.length; k++) {
                newVisitedX[k] = visitedX[k];
                newVisitedY[k] = visitedY[k];
              }
              visitedX = newVisitedX;
              visitedY = newVisitedY;
            }
            visitedX[visitCount] = x;
            visitedY[visitCount] = y;
            visitCount++;
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
    }

    return -1;
  }

  public static void main(String[] args) {
    String filename = "input.txt";
    int result = part2(filename);
    System.out.println(result);
  }
}

