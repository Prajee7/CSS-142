import java.util.Random;

public class ArrayRand {
  public static void main(String []args) {
    int size = 10;
    randArray(size);
    int num = 5;
    int arr[] = {1,5,3,4,5,5,6,8,5};
    System.out.println(howMany(num, arr));
    printReverse(arr);
  }

  public static void randArray(int size) {
    int rand[] = new int [size];
    Random gen = new Random();
    for(int i = 0; i < rand.length; i++) {
      rand[i] = gen.nextInt(101);
      System.out.print(rand[i] + " ");
    }
    System.out.println();
  }

  public static int howMany(int num, int arr[]) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
      if(num == arr[i]) {
        count++;
      }
    }
    return count;
  }
  public static boolean hasNumber(int num, int arr[]) {
    for(int i = 0; i < arr.length - 1; i++) {
      if(!(num == arr[i])) {
        return false;
      }
    }
    return true;
  }

  public static boolean doesNotHaveNumber(int num, int arr[]) {
    for(int i = 0; i < arr.length - 1; i++) {
      if((num == arr[i])) {
        return false;
      }
    }
    return true;
  }

  public static boolean increasingOrder(int arr[]) {
    for(int i = 0; i < arr.length - 1; i++) {
      if(arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
  
  public static void printReverse (int arr[]) {    
    for(int i = arr.length - 1; i > 0; i--){ 
        System.out.print(arr[i]);
    }
  }
}
