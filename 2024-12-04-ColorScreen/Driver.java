import java.util.Random;

public class Driver{
  public static void makeBorder(int width, int height){
    for (int y = 0; y < height; y++){
      for (int x = 0; x < width; x++){
        if (y == 0 || y == height - 1 || x == 0 || x == width - 1){
          System.out.print("\u001B[44m \u001B[0m");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }