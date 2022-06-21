public class MainDie {
  public static void main(String []args) {
    
    Die dice = new Die (6);
    Die dice2 = new Die (6);
    int count = 1;
    while(dice.getValue() != 6 || dice2.getValue() != 6) {
      dice.roll();
      dice2.roll();
      count++;
    }
    System.out.println(count);
  }
}
