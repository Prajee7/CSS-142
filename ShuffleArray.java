
public class ShuffleArray {
  public static void main(String[] args) {
    // int[] arry = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    // Random rng = new Random();
    // int index;
    // int temp;
    // for (int i = 0; i < arry.length; i++) {
    //   index = rng.nextInt(10);
    //   temp = arry[i];
    //   arry[i] = arry[index];
    //   arry[index] = temp;
    // }
    // System.out.println(Arrays.toString(arry));
    System.out.print(isPalindrome());

  }

  public static boolean isPalindrome() {
    String [] palindrome = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
    int fIndex = 0;
    int bIndex = palindrome.length - 1;
    while(fIndex != bIndex) {
      if(!(palindrome[fIndex].equals(palindrome[bIndex]))) {
        return false;
      }
      fIndex++;
      bIndex--;
    }
    return true;
  }
}
