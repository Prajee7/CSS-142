import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class AtTable {
  public static void main(String []args) {
    PrintWriter write = null;
    try {
      write = new PrintWriter(new FileOutputStream("tables.txt"));
      typeNames(write);
      write.close();
      System.out.println("Enter name: ");
      Scanner input = new Scanner(System.in);
      String name = input.next();
     // atTable(name);
      System.out.print(atTable(name));
      input.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
      System.exit(0);
    }
    

  }

  public static void typeNames(PrintWriter write) {
    write.println("Tushar");
    write.println("Liam");
    write.println("Zainab");
    write.println("Andy");
    write.println("Jensen");
    write.println("An");
    write.println("Deb");
    write.println("Glick");
  }

  public static boolean atTable(String name) {
    try {
        Scanner console = new Scanner(new FileInputStream("tables.txt"));
        while (console.hasNextLine()) {
            String input = console.nextLine();
            if (input.equals(name)) {
                return true;
            }
        }
        console.close();
    } catch (FileNotFoundException e) {
        System.out.println("Name cannot be found");
    }
    return false;
  }

}

