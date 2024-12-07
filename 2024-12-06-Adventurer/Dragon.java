public class Dragon extends Adventurer {
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
