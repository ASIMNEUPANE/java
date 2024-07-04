


public class Encapsulation {
 private String name;

 //getter
  public String getName(){
    return  name;
  }

  //setter
  public void setName(String name){
    this.name = name;
  }


  public static void main(String[] args) {
      
    Encapsulation myObj = new Encapsulation();
    myObj.setName("asim");
    System.out.println(myObj.getName());
  }}
    

