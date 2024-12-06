public abstract class Warrior extends Adventurer{
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  public String getSpecialName(){
    return ("Strength");
  }
  public int getSpecial() {
    return special;
  }
  public void setSpecial(int num) {
    special = num;
  }
  public int getSpecialMax() {
    return 50;
  }
  public String attack(Adventurer other){
    other.applyDamage(getSpecial());
    return "You have damaged " + other.getName() + "by " + getSpecial() + "hp!";
  }
  public String specialAttack(Adventurere other){
    other.applyDamage(20);
    other.setSpecial(other.getSpecial() - 10);
    return "You have done a special attack on " + other.getName() + "and damaged them by 20 hp and 10 special!";
  }
}
