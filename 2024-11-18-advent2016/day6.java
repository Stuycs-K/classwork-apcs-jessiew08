import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6{
  public static String corruptMessage(String filename){
    String message = "";
    try (Scanner scanner = new Scanner(new File(filename))){
      String[] lines = new String[0];
      int lineCount = 0;

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        if (lines.length == 0) {
          lines = new String[1];
        } else if (lineCount == lines.length) {
          String[] newLines = new String[lines.length * 2];
          for (int i = 0; i < lines.length; i++) {
            newLines[i] = lines[i];
          }
          lines = newLines;
        }
        lines[lineCount++] = line;
      }

      String[] validLines = new String[lineCount];
      for (int i = 0; i < lineCount; i++) {
        validLines[i] = lines[i];
      }
      lines = validLines;

      int columns = lines[0].length();
      int[][] freq = new int[columns][26];
    }
  }

  public static void main(String[] args) {
    String filename = "message.txt";
    System.out.println(corruptMessage(filename));
  }
}


