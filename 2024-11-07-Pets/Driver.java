//Step 8:
//When super.speak is called from Bird in speak, the getName in Animal is overridden by the new getName in Bird.
//Therefore the name that is printed has the changes that were made to getName in Bird.java.
//Step 10:
// Bird b2 = new Animal() didn't work because Animal is not a subclass of Bird, meaning that Animal-is-a-Bird is false.
// But, Animal a1 = new Animal(); and Animal a2 = new Bird(); work because of that Bird-is-a-Animal, meaning that Bird is a subclass of Animal
public class Driver{
  public static void main(String[] args){
    Animal a1 = new Animal("Moo", 5, "Cow");
    a1.speak();

    Bird b1 = new Bird("Chirp", 2, "Bird", 5, "Blue");
    b1.speak();

    //Bird b2 = new Animal("Woof", 2, "Dog");
    //b2.speak();

    Animal a2 = new Bird("Tweet", 3, "Sam", 4, "Red");
    a2.speak();
  }
}
