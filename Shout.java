import java.util.Scanner;

public class Shout {
  public static void main(String []args) {
  Scanner input = new Scanner(System.in);
  System.out.println("write a word:");
  String str = input.next();
  shout(str); 
  input.close();
  } 

  public static void shout (String str) {
    String cStr = str.toUpperCase();
    System.out.println(cStr);
  }
}
