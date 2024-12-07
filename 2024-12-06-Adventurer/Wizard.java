public class Wizard{
  private int mana;

  public Wizard(String name) {
    super(name);
    this.mana = 50;
  }

  public Wizard(String name, int hp) {
    super(name, hp);
    this.mana = 50;
  }

  public String getSpecialName() {
    return "Mana";
  }

  public int getSpecial() {
    return mana;
  }

  public void setSpecial(int num) {
    this.mana = Math.max(0, Math.min(num, getSpecialMax()));
  }

  public int getSpecialMax() {
    return 100;
  }

  public String attack(Adventurer other) {
    if (getSpecial() >= 5) {
      setSpecial(getSpecial() - 5);
      other.applyDamage(10);
      return getName() + " attacks " + other.getName() + ", dealing 10 damage and spending 5 mana!";
    } else {
      return getName() + " doesn't have enough mana to attack!";
    }
  }

  public String specialAttack(Adventurer other) {
    if (getSpecial() >= 20) {
      setSpecial(getSpecial() - 20);
      other.applyDamage(30);
      return getName() + " casts a fireball on " + other.getName() + ", dealing 30 damage and spending 20 mana!";
    } else {
      return getName() + " doesn't have enough mana to perform a special attack!";
    }
  }

  public String support() {
    if (getSpecial() >= 10) {
      setSpecial(getSpecial() - 10);
      setHP(getHP() + 15);
      return getName() + " heals themselves by 15 HP, spending 10 mana!";
    } else {
      return getName() + " doesn't have enough mana to heal themselves!";
    }
  }

  public String support(Adventurer other) {
    if (getSpecial() >= 10) {
      setSpecial(getSpecial() - 10);
      other.setHP(other.getHP() + 15);
      return getName() + " heals " + other.getName() + " by 15 HP, spending 10 mana!";
    } else {
      return getName() + " doesn't have enough mana to heal allies!";
    }
  }
}