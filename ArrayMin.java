public class ArrayMin {
  public static void main(String [] args) {
    int x = min (3,5,7,8);
    System.out.println(x);
  }

  public static int min(int... arg) {
    int min = arg[0];
    for(int i = 0; i < arg.length; i ++) {
      if(min >= arg[i]) {
        min = arg[i];
      }
    }
    return min;
  }

}
