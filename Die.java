import java.util.Random;

public class Die {

  private int sides;
  private int value;
  private Random rand = new Random();

  public Die(int sides) {
    this.sides = sides;
    roll();
  }

  public int getValue() {
    return value; 
  }

  public void roll() {
    value = rand.nextInt(sides) + 1;
  }

}
