

class Bird{
public void sing() {
    
    System.out.println("bird bird");
}
}

class Parrot extends  Bird{
    public void sing(){
    
    System.out.println("quck quck");
}
}

class Egale extends  Bird{
   

}



public class Polymorfism {
    
    public static void main(String[] args) {
        Parrot bird = new Parrot();
        bird.sing();
    }
}
