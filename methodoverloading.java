



public class methodoverloading {
    static  int plusMethod(int x , int y){
        return x + y;
    }

    static double plusMethod(double x , double y){
        return  x + y;
    }
      

    public static void main(String[] args) {
        System.out.println(plusMethod(1, 2));
        System.out.println(plusMethod(1.7,1.5));
    }
    
}

