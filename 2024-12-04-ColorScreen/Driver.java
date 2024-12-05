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

  public static void displayRandomNumbers(int[] numbers, int width) {
    System.out.print("\033[1;2H");
    int space = width / (numbers.length + 1);
    for (int i = 0; i < numbers.length; i++) {
      int x = (i + 1) * space - 1;
      System.out.print("\033[" + x + "G");
      if (numbers[i] < 25) {
        System.out.print("\u001B[91m" + numbers[i] + "\u001B[0m");
      } else if (numbers[i] > 75) {
        System.out.print("\u001B[92m" + numbers[i] + "\u001B[0m");
      } else {
        System.out.print("\u001B[37m" + numbers[i] + "\u001B[0m");
      }
    }
    System.out.println();
  }