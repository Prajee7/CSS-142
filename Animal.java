public class Animal {
  private int size;
  private String animalname;
  //private int count = 0;

  public void setSize(int x) {

    size = x;
  }

  public int getSize() {

    return this.size;
  }

  public void setAnimalName(Animal[] zooName, String name) {

  }

  public String toString() {

    return ("<" + animalname + ": " + getSize() + ">");
  }

  public Animal(String name, int size) {
    menu();
    setSize(size);
  }

  private void addAnimals(Animal[] zooName) {
    setAnimalName(zooName, animalname);

  }

  private void listAnimal(Animal[] zooName) {

  }

  private Animal getLargest(Animal[] zooName) {
    return zooName[0];
  }

  private Animal getSmallest(Animal[] zooName) {
    return zooName[0];
  }

  private void menu() {
    Animal[] zooName = new Animal[10];
    while (true) {
      int choice = 0;
      System.out.println("1. Add a new animal");
      System.out.println("2. List all animal");
      System.out.println("3. Display largest animal");
      System.out.println("4. Display smallest animal");
      switch (choice) {
      case 1:
        addAnimals(zooName);
        break;
      case 2:
        listAnimal(zooName);
        break;
      case 3:
        Animal largest = getLargest(zooName);
        System.out.println(largest);
        break;
      case 4:
        Animal smallest = getSmallest(zooName);
        System.out.println(smallest);
        break;
      case 10:
        System.exit(0);
      }
    }
  }



}
