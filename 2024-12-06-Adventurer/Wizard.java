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