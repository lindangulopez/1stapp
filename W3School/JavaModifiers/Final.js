//If you don't want the ability to override existing attribute values, declare attributes as final:

public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error
    myObj.PI = 25; // will generate an error
    System.out.println(myObj.x); 
  }
}
