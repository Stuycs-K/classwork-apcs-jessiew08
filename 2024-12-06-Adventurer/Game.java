import java.util.Scanner;

public class Game{
  public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name:");
    String playerName = userInput.nextLine();
    Adventurer player = new Wizard(playerName, 100);
    Adventurer enemy = new CodeWarrior();
    boolean gameRunning = true;

    while (gameRunning) {
      System.out.println("\nPlayer: " + player.getName() + ", HP: " + player.getHP() + ", " + player.getSpecialName() + ": " + player.getSpecial());
      System.out.println("Enemy: " + enemy.getName() + ", HP: " + enemy.getHP() + ", " + enemy.getSpecialName() + ": " + enemy.getSpecial());

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();

      String result = "";
      boolean validInput = true;

      if (input.equals("a") || input.equals("attack")) {
        result = player.attack(enemy);
      } else if (input.equals("sp") || input.equals("special")) {
        result = player.specialAttack(enemy);
      } else if (input.equals("su") || input.equals("support")) {
        result = player.support();
      } else if (input.equals("quit")) {
        System.out.println("You quit the game.");
        gameRunning = false;
      } else {
        validInput = false;
        System.out.println("Invalid input, please try again.");
      }

      if (gameRunning && validInput) {
        System.out.println(result);
        if (enemy.getHP() <= 0) {
          System.out.println("You defeated " + enemy.getName() + "!");
          gameRunning = false;
        } else {
          int enemyAction = (int) (Math.random() * 3);
          if (enemyAction == 0) {
            result = enemy.attack(player);
          } else if (enemyAction == 1) {
            result = enemy.specialAttack(player);
          } else {
            result = enemy.support();
          }
          System.out.println(result);
          if (player.getHP() <= 0) {
            System.out.println("You were defeated by " + enemy.getName() + "...");
            gameRunning = false;
          }
        }
      }
    }
    userInput.close();
  }
}
