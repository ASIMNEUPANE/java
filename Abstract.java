
abstract  class Animal{
    public abstract  void sound();
    public void sleppSound(){
        System.out.println("Sssleep");
    }
}

class Dog extends  Animal{
    public void sound(){
     System.out.println("Bark bark bark");

    }
}


public class Abstract {
    
    public static void main(String[] args) {
        
        Dog ani = new Dog();
        ani.sound();
    }
}
