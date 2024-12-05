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

  public static void makeHorizontalSeparator(int width, int row) {
    System.out.print("\033[" + row + ";1H");
    for (int x = 0; x < width; x++) {
      System.out.print("\u001B[44m-\u001B[0m");
    }
    System.out.println();
  }

  public static void makeMiddleArt(int width, int height) {
    int midX = width / 2;
    int midY = height / 2;
    System.out.print("\033[" + midY + ";" + midX + "H");
    System.out.print("\u001B[93m:)\u001B[0m");
  }

  public static void moveCursorToEnd(int height) {
    System.out.print("\033[" + (height + 1) + ";1H");
  }

  public static void main(String[] args) {
    int width = 80;
    int height = 30;
    Random rand = new Random();
    int[] randomInts = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};

    makeBorder(width, height);
    displayRandomNumbers(randomInts, width);
    makeHorizontalSeparator(width, 2);
    makeMiddleArt(width, height);
    moveCursorToEnd(height);
  }
}