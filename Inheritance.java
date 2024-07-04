public  class Inheritance {
    
    protected  String brand ;

    protected  Inheritance(){
        brand = "fodMotors";
    }
    public void honk(){
        System.out.println("tutu");
    }

}


class Car extends Inheritance{
    private String modelName = "mustang";

    public static void main(String[] args) {
        Inheritance myCar = new Inheritance();
        System.out.println(myCar.brand);
    }
}
