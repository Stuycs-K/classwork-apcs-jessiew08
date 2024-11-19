import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day4{
  public static int room(String filename){
    int sum = 0;
    try(Scanner scanner = new Scanner(new file(filename))){
      while (scanner.hasNextLine()){
        String room = scanner.nextLine();
        String[] parts = room.split("-");
        String encryptedName = "";
        for (int i=0; i<parts.length; i++){
          encryptedName = encryptedName + parts[i,i+1];
        }
      }
    }
  }
}
