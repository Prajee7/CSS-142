/* Prajeet Pounraj
* CSS 142
* ICA TotalCost using forloops
*/
import java.util.Scanner;

public class TotalCostLoops {
    public static void main (String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many items: ");
        int items = userInput.nextInt();
        double price;
        double totalCost = 0;
        for(int i = 0; i < items; i++ ) {
            System.out.print("Enter price: ");
            price = userInput.nextInt();
            totalCost += price;
        }
        
        System.out.println("The total cost is " + totalCost);
        userInput.close();

    }
}
