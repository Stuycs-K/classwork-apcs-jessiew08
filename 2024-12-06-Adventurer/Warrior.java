public abstract class Warrior extends Adventurer{
  public Warrior(String name){
    super(name);
    this.special = 25;
  }
  public Warrior(String name, int hp){
    super(name, hp);
    this.special = 25;
  }
  public String getSpecialName(){
    return "Strength";
  }
  public int getSpecial() {
    return special;
  }
  public void setSpecial(int num) {
    this.special = Math.max(0, Math.min(num, getSpecialMax()));
  }
  public int getSpecialMax() {
    return 50;
  }
  public String attack(Adventurer other){
    other.applyDamage(getSpecial());
    return getName() + " attacks " + other.getName() + ", dealing 10 damage!";
  }
  public String specialAttack(Adventurere other){
    if (getSpecial() >= 10){
      other.applyDamage(20);
      setSpecial(getSpecial() - 10);
      return getName() + " performs a special attack on " + other.getName() + ", dealing 20 damage and using 10 Strength!";
    }
    else{
      return getName() + " tries a special attack but lacks Strength!";
    }
 }
}
