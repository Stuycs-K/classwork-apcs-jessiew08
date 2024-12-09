import java.util.Scanner;

public class Game{
  public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter player name");
    String playerName = userInput.nextLine();
    System.out.println("Your player name is: " + playerName);
    Adventurer player = new Wizard(playerName, 100);
    Adventurer enemy = new CodeWarrior();
    System.out.println(player.getName() + ", HP: " + player.getHP() + ", " + player.getSpecialName() + ": " + player.getSpecial());
    System.out.println(enemy.getName() + ", HP: " + enemy.getHP() + ", " + enemy.getSpecialName() + ": " + enemy.getSpecial());
  }
}
