public class Car {
  private int speed; 
  private String brand;

  public void setSpeed(int x) {

    speed = x;
  }

  public void setBrand(String name) {

    brand = name;
  }

  public int getSpeed() {

    return speed;
  }

  public String getBrand() {
    
    return brand;
  }

  public boolean isFaster(Car other) {
    if(speed > other.speed) {
      return true;
    }
    return false;
  }

  public String toString(Car other) {
    if(isFaster(other)) {
      return brand;
    } 
    return other.brand;
  }

  public Car(String name, int x) {
    setSpeed(x);
    setBrand(brand);
  }

}
