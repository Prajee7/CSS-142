/*
 * Prajeet Pounraj
 * 10/13/21
 * CSS 142 (UpArrow)
*/

public class UpArrow {

  /**
  * This is a main method that calls for the arrow method.
  */
  public static void main(String []args) {
    arrow(9); //calls upon arrow with the int size 9.
    arrow(15);
    arrow(31);
  }

  /** 
  * This is a main method checks to see if the input given is odd.
  */
  public static void arrow(int size) {
    if (size % 2 == 1) {
      arrowHead(size);
      arrowTail(size);
    }
  } //end of arrow method.

  /**
  * This method prints the dots and stars in the arrow head using for loops.
  */ 
  public static void arrowHead(int size) {
    int dots = (size / 2);
    int stars = 1;
    
    for (int x = 0; x < (size / 2 + 1); x++) {
      for (int y = 0; y < dots; y++) {
        System.out.print(".");
      }
      for (int a = 0; a < stars; a++) {
        System.out.print("*");
      }
      for (int y = 0; y < dots; y++) {
        System.out.print(".");
      }
      stars = stars + 2;
      dots--;
      System.out.println();
    }
  } //end of arrowhead method.

  /**
  * This method prints the dots and stars in the arrow tail using for loops.
  */ 
  public static void arrowTail(int size) {
    int star = (size - 1) / 4;
    int dot = (size - star) / 2;

    for (int x = 1; x <= size; x++) {
      for (int y = 0; y < dot; y++) {
        System.out.print(".");
      }
      for (int z = 0; z < star; z++) {
        System.out.print("*");
      } 
      for (int y = 0; y < dot; y++) {
        System.out.print(".");
      }
      System.out.println();
    }
    
  }

}