//When super.speak is called from Bird in speak, the getName in Animal is overridden by the new getName in Bird.
//Therefore the name that is printed has the changes that were made to getName in Bird.java.
public class Driver{
  public static void main(String[] args){
    Animal a1 = new Animal("Moo", 5, "Cow");
    a1.speak();

    Bird b1 = new Bird("Chirp", 2, "Bird", 5, "Blue");
    b1.speak();
  }
}
