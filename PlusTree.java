public class PlusTree {
  public static void main(String [] args) {
    plusMinusTree(5,3);
    plusMinusTree(10,5);
  }

  public static void plusMinusTree (int height, int width) {
    for(int x = 0; x < height; x++ ) {
      for(int i = 0; i < width; i++) {
        if(i % 2 == 0) {
          System.out.print("-");
        } else {
          System.out.print("+");
        }
      }
      System.out.println();
    }
  }
}
