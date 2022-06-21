import java.util.Scanner;

public class Largest {
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();
    int hnumber = number;

    while(number != -1) {
      System.out.println("Try again!");
       
      if(number > hnumber) {
        hnumber = number ;
      }

      number = input.nextInt();
      System.out.println("largest number = " + hnumber);
    }
    input.close();
  }

}
