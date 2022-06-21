
public class Stars {
  public static void main(String [] args) {
    int base = 8;
    printStars(base);
    printLines(base);
  }  

  public static void printStars(int base){
    for(int i = 0; i < base; i++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  public static void printLines(int base) {
    while(base != 0){
      base--;
      printStars(base);
    }
  }

}
