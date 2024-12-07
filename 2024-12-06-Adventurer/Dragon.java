public abstract class Dragon extends Adventurer {
  private int rage;

  public Dragon(String name) {
    super(name);
    this.rage = 30; 
  }

  public Dragon(String name, int hp) {
    super(name, hp);
    this.rage = 30;
  }


  public String getSpecialName() {
    return "Rage";
  }

  public int getSpecial() {
    return rage; 
  }

  public void setSpecial(int num) {
    this.rage = Math.max(0, Math.min(num, getSpecialMax()));
  }

  public int getSpecialMax() {
    return 100; 
  }

  public String attack(Adventurer other) {
    if (getSpecial() >= 5) {
      setSpecial(getSpecial() - 5);
      other.applyDamage(15);
      return getName() + " swipes at " + other.getName() + ", dealing 15 damage and spending 5 rage!";
    } else {
      return getName() + " doesn't have enough rage to attack!";
    }
  }

  public String specialAttack(Adventurer other) {
    if (getSpecial() >= 20) {
      setSpecial(getSpecial() - 20);
      other.applyDamage(40);
      return getName() + " unleashes a fiery breath on " + other.getName() + ", dealing 40 damage and spending 20 rage!";
    } else {
      return getName() + " doesn't have enough rage to perform a special attack!";
    }
  }

  public String support() {
    if (getSpecial() <= getSpecialMax() - 10) {
      setSpecial(getSpecial() + 10);
      return getName() + " roars and regains 10 rage!";
    } else {
      return getName() + " is already at maximum rage!";
    }
  }

  public String support(Adventurer other) {
    if (getSpecial() <= getSpecialMax() - 10) {
      setSpecial(getSpecial() + 10);
      return getName() + " roars and boosts special for allies by 10!";
    } else {
      return getName() + " can't boost allies' special any further!";
    }
  }
}