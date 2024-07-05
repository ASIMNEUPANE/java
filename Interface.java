// Interface
interface Man {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

interface Second{
  public void aa()
}

// Pig "implements" the Animal interface
class Pig implements Man, Second {  //multiple interdace
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  // public void sleep() {
  //   // The body of sleep() is provided here
  //   System.out.println("Zzz");
  // }
}

class Interface {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    // myPig.sleep();
  }
}