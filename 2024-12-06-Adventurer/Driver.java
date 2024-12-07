public class Driver {
  public static void main(String[] args) {

    Adventurer warrior = new Warrior("Arthas", 150);
    Adventurer wizard = new Wizard("Gandalf", 100);
    Adventurer dragon = new Dragon("Smaug", 200);

    System.out.println("Warrior:");
    System.out.println(warrior.attack(wizard));
    System.out.println(((Warrior) warrior).specialAttack(wizard));
    System.out.println(((Warrior) warrior).support());
    System.out.println();

    System.out.println("Wizard:");
    System.out.println(wizard.attack(dragon));
    System.out.println(((Wizard) wizard).specialAttack(dragon));
    System.out.println(((Wizard) wizard).support());
    System.out.println();

    System.out.println("Dragon:");
    System.out.println(dragon.attack(warrior));
    System.out.println(((Dragon) dragon).specialAttack(warrior));
    System.out.println(((Dragon) dragon).support());
    System.out.println(((Dragon) dragon).support(dragon));
  }
}
