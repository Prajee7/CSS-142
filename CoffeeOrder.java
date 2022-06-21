/* 
*  Prajeet Pounraj
*  CSS 142 D
*  Create CoffeeOrder 3000
*  Takes order from user and prints the total cost of the order.
*/
import java.util.Scanner;

public class CoffeeOrder {

  /** the method below is the main method.
   */
  public static void main(String [] args) { 
    System.out.println("Welcome to CoffeeOrder 3000");
    Scanner userInput = new Scanner(System.in);
    numOfDrinks(userInput);
  }

  /** The method below takes the input from the user based on how many drinks they want 
  *  the method will intiate another method using that value.
  */
  public static void numOfDrinks(Scanner userInput) {
    System.out.print("How many espresso drinks would you like today (0-3): ");
    System.out.println();
    int numberOfDrinks = userInput.nextInt();
    numOfOrders(numberOfDrinks);
  }

  /**splits the program into three parts, if the user selects the correct order than it will take
  * them to another method to execute the rest of the program otherwise it stops in this method.
  */
  public static void numOfOrders(int numberOfDrinks) {
    if (numberOfDrinks == 0) {
      System.out.println("OK, so you do not want any espressos today!");
      System.out.println("Thank you for using CoffeeOrder 3000");
    } else if (1 <= numberOfDrinks && numberOfDrinks < 4) {
      int remDrinks = numberOfDrinks;
      int counter = 1; 
      kindOfOrder(remDrinks, counter);
    } else {
      throw new AssertionError();
    }
  }

  /** the method below is called kindOfOrder. It takes in the amount of drinks 
  * and a counter variable within its parameters
  * and uses nested if loops within a while loop to touch bases on all sorts of 
  * variation of orders and adds it to a total cost variable and prints it.
  */
  public static void kindOfOrder(int remDrinks, int counter) {
    Scanner userInput = new Scanner(System.in);
    double price = 0;
    while (1 <= remDrinks) {
      System.out.println("Getting order for espresso drink #" + counter);
      System.out.println("What type (1: Americano, 2: Latte, 3: Mocha): ");
      int coffeeType = userInput.nextInt();
      // the loop below handles any Americano Orders and adds it to the price.
      if (coffeeType == 1) {
        System.out.println("What size (1: Tall, 2: Grande): ");
        int size = userInput.nextInt();
        if (size == 1) {
          price = price + 2.65;
        } else if (size == 2) {
          price = price + 2.95;
        } else {
          throw new AssertionError();
        }
      // the loop below handles any Latte Orders and it adds it to the price
      } else if (coffeeType == 2) {
        System.out.println("What size (1: Tall, 2: Grande): ");
        int size = userInput.nextInt();
        if (size == 1) {
          price = price + 3.35;
        } else if (size == 2) {
          price = price + 3.95;
        } else {
          throw new AssertionError();
        }
      // the loop below handles any Mocha Orders and it adds it to the price
      } else if (coffeeType == 3) {
        System.out.println("What size (1: Tall, 2: Grande): ");
        int size = userInput.nextInt();
        if (size == 1) {
          price = price + 3.85;
        } else if (size == 2) {
          price = price + 4.45;
        } else {
          throw new AssertionError();
        }
      } else {
        throw new AssertionError();
      }
      
      counter++;
      remDrinks = remDrinks - 1;
    }
    System.out.printf("Your total is %2.2f\n", price);
    System.out.println("Thank you for using CoffeeOrder 3000");
  }

}
