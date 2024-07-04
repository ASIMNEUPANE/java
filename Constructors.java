


public class Constructors {
    int x;
int z;
     private Constructors(int y){
        // we can pass parameter to constructor also
        x=y ;
        z=5;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(6);  //this will call the constructor & create an object
        System.out.println(myObj.x);

    }
}

