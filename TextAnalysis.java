import java.util.Scanner;

/**.
 * Prajeet Pounraj
 * Text Analysis - CSS 142
 * Oct 18
 */

public class TextAnalysis {

  /** 
   * Main Method calls textAnalysis method.
   */
  public static void main(String[] args) {
    textAnalysis();
  }

  /**
   * This methods get inputs from user and calls analyzeLine(). It keeps asking
   * for inputs until user enter "stop" When user enters "stop", the method will
   * end with "All done!" NOTE: this method is required for testing, you must not
   * delete it
   */
  public static void textAnalysis() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a line (use stop to end): ");
    String word = input.nextLine();

    while (!word.equalsIgnoreCase("stop")) { 
      analyzeLine(word.toLowerCase());
      System.out.print("Enter a line (use stop to end): ");
      word = input.nextLine();
    } 
    
    System.out.println("All done!");
    input.close();

  }

  /**
   * This method calculates the number of times c appears in the message.
   * For example, if message = "abcbcbc", and c = 'b', then the method should return 3
   * If no c character appears in the message, return 0
   * NOTE: this method is required for testing, you must not delete it
   */
  public static int countChar(String word, char c) {
    int number = 0;   
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == c) {
        number++;
      }
    }
    return number;
  }

  /**
   * Takes in the paramater word from the user and compares it to every alphabet
   * and if it exists it will add one to the number variable and if number is
   * larger than one then it will print that character and how many times it
   * appears.
   */
  public static void analyzeLine(String word) {
    for (char curr = 'a'; curr <= 'z'; curr++) {
      if (countChar(word, curr) >= 1) {
        System.out.printf("%c: ", curr);
        System.out.println(countChar(word, curr));
      }
    }
  
  } // end of method

} // end of program
