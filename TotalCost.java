/* Prajeet Pounraj
*  10/4/2021
*  In-Class Assignment:
* 
*  Write a program that will firtly ask the user how many times they have purchased and then prompt
*  user to enter the price of each item. The program should display the total at the end. 
*/

import java.util.Scanner;

public class TotalCost {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner (System.in); //creation of scanner object

        System.out.print("How many items: "); // prompts the user how many items
        int numOfItems = keyboard.nextInt(); // takes userInput

        int constant = 0;
        double total = 0;
        
        // while loop runs till the number of items is met and publishes the total by adding it all the price together.
        while(constant < numOfItems){ 
            System.out.print("Enter price: ");
            double price = keyboard.nextInt();
            total = total + price;
            constant++;
        }
        System.out.println("The total is " + total);
        keyboard.close();
    }
}
