import java.io.*;
import java.util.*;

/** Write a description of class Scrabble here.
 * @author Prajeet Pounraj
 * @version 11/2/21
 */

public class Scrabble {
  public static String wordFile = "anotherlist.txt"; // change to your txt filename
  
  public static void main(String[] args) {
    findWords();
  }

  /** Read the Scrabble dictionary.
  * Get user tiles (7 characters long).
  * Find and print all the words that can be made from the given tiles.
  */
  public static void findWords() {
    String wordFile = "biglist.txt";
    String [] dictWords = readWordList(wordFile);
    String mytiles = getUserTiles();
    // make sure we have 7 tiles
    assert (mytiles.length() == 7);
    // make sure we have all lowercase tiles
    assert (mytiles.toLowerCase().equals(mytiles));
    int [] myhistogram = getHistogram(mytiles);
    int count = 0;
    for (int i = 0; i < dictWords.length; i++) {
      int [] wordH = getHistogram(dictWords[i]);
      // System.out.println("Checking " + dictWords[i]);
      if (canMakeWord(myhistogram, wordH)) {
        count++;
        System.out.println(count + ": " + dictWords[i]);
      }
    }
    System.out.printf("Found %d words that can be made from %s.\n", count, mytiles);
  }

  
  /** Read all the words in the given file and return them.
  * in a String array.
  * Uses countLines to figure out the how big the array
  * of words has to .
  */
  public static String[] readWordList(String filename) {
    String [] words = new String [countLines(filename)];
    Scanner reader = null;
    int i = 0;
    try {
      File obj = new File(filename);
      reader = new Scanner(obj);
    } catch (Exception e) {
      System.out.println("File not found!");
      throw new AssertionError();
    }
    while (reader.hasNextLine()) {
      words[i] = reader.nextLine();
      i++;
    }
    reader.close();
    
    return words;
  }
    
  /** Creates a histogram for the given string
  * Histogram shows how many times each letter appears in string
  * The histogram is always an integer array with length 26 where
  * histogram[0] represents how many times 'a' appears
  * histogram[1] represents how many times 'b' appears
  * ...
  * histogram[25] represents how many times 'z' appears
  * The histogram for "age" would be
  * { 1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }
  * The histogram for "azzz" would be
  * { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3 }
  */
  public static int[] getHistogram(String str) {
    System.out.println("Getting histogram for " + str);
    int [] histogram = new int[26]; 
    int index = 0;
    int count;
    for (char curr = 'a'; curr <= 'z'; curr++) {
      count = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == curr) {
          count++;
          histogram[index] = count;
        }
      }
      //System.out.print(histogram[index] + " ");
      index++;
    }
    //System.out.println();
    return histogram;
  }
    
  /** Given two histograms representing user tiles and dictionary word
  * return true if the dictionary word can be formed from the tiles
  * For each letter in wordHistogram, we need to have at least that many tiles
  * tileHistogram and wordHistogram are both length 26
  * For example, given tileHistogram "abe"
  * { 1,1,0,0,1,0, ... }
  * We can form the word "ab" which has a histogram of
  * { 1,1,0,0,0,0, ... }
  * But we cannot form the word "abb" which has a histogram of
  * { 1,2,0,0,0,0, ... }
  * if wordHistogram appears in tileHistogram return true else false.
  */
  public static boolean canMakeWord(int[] tileHistogram, int[] wordHistogram) {
    for (int i = 0; i < tileHistogram.length; i++) {
      if (tileHistogram[i] < wordHistogram[i]) {
        return false;
      }
    }
    return true;
  }
  
  /** Gets a String from user via keyboard representing the Scrabble tiles
  * The String has to be all lowercase and needs to have 7 letters
  * Steps to compare: 
  * 1. input's length is 7
  * 2. input is in lowercase
  * 3. input is in range a-z
  * NOTE: do not use a loop to retake new input from user
  */
  public static String getUserTiles() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your tiles: ");
    String word = scan.nextLine();
    if (word.length() != 7) {
      System.out.println("Input has " + word.length() + " characters, need 7");
      throw new AssertionError(); 
    }
    for (int i = 0; i < word.length(); i++) {
      for (char curr = 'A'; curr <= 'Z'; curr++) {
        if (word.charAt(i) == curr) {
          System.out.println("Input needs to be all lowercase: " + word);
          throw new AssertionError();
        }
      }
      if (!Character.isLetter(word.charAt(i))) {
        System.out.println("Need characters a-z, not: " + word);
        throw new AssertionError();
      }
    } 
    scan.close();
    return word;
  }
    
  /**
  * Counts the number of lines for the given file.
  */
  public static int countLines(String filename) {
    int count = 0;
    Scanner scan = null;
    try {
      scan = new Scanner(new File(filename));
    } catch (Exception e) {
      System.out.println("File not found!");
      throw new AssertionError();
    }
    while (scan.hasNextLine()) {
      scan.nextLine();
      count++;
    }
    // System.out.println(count);
    scan.close();
    return count;
  }
    
} // end of class