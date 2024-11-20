import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day4 {
  public static int room(String filename) {
    int sum = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        String room = scanner.nextLine();
        int lastDashIndex = room.lastIndexOf('-');
        int bracketIndex = room.indexOf('[');
        String encryptedName = room.substring(0, lastDashIndex).replace("-", "");
        int sectorId = Integer.parseInt(room.substring(lastDashIndex + 1, bracketIndex));
        String checksum = room.substring(bracketIndex + 1, room.length() - 1);
        int[] letterCounts = new int[26];
        for (int i = 0; i < encryptedName.length(); i++) {
          char c = encryptedName.charAt(i);
          letterCounts[c - 'a']++;
        }

        char[] sortedChars = new char[26];
        for (int i = 0; i < 26; i++) {
          sortedChars[i] = (char) ('a' + i);
        }


        for (int i = 0; i < 25; i++) {
          for (int j = i + 1; j < 26; j++) {
            if (letterCounts[sortedChars[j] - 'a'] > letterCounts[sortedChars[i] - 'a'] ||
                (letterCounts[sortedChars[j] - 'a'] == letterCounts[sortedChars[i] - 'a'] &&
                 sortedChars[j] < sortedChars[i])) {
              char temp = sortedChars[i];
              sortedChars[i] = sortedChars[j];
              sortedChars[j] = temp;
            }
          }
        }


        String calculatedChecksum = "";
        for (int i = 0; i < 5; i++) {
          calculatedChecksum += sortedChars[i];
        }


        if (calculatedChecksum.equals(checksum)) {
          sum += sectorId;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
    }

    return sum;
  }

  public static void main(String[] args) {
    String filename = "rooms.txt";
    int result = room(filename);
    System.out.println(result);
  }
}
