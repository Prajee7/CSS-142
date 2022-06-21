public class BubbleSort {
  public static void main(String [] args) {
    boolean order = true;
    int arry [] = {6, 7, 9, 10, 2, 18};
    while(order) {
      order = false;
      for(int i = 0; i < arry.length - 1; i++) {
        if(arry[i] > arry[i + 1]) { 
          int temp = arry[i];
          arry[i] = arry[i + 1];
          arry[i + 1] = temp;
          order = true;
        }
      }
    }
    for(int x = 0; x < arry.length; x++) {
    System.out.print(arry[x] + " ");
    }
  }
}
