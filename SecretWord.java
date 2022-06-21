import java.util.Random;
import java.util.Scanner;
/**
 * This is a program that creates a game like hangman without graphics 
 * The goal of this game is to guess a word.
 * @author Prajeet Pounraj and Tushar Ganta
 * @version 11/10/21
 */


public class SecretWord {
  String[] words = { "bike", "door", "flower", "coffee", "table", "dragalia" };
  String secretWord; // randomly chosen secret word
  char[] blanks;
  char[] guessedLetters; // letters array to record guesses (max 100)
  int guesses; // total number of guesses
  int badGuesses; // total number of guesses that are not in secret word
  int maxGuesses; // maximum bad guesses allowed
  int i;

  // Create new SecretWord object
  // set secretWord, guessedLetters, guesses, maxGuesses and badGuesses
  SecretWord() {
    Random rand = new Random();
    int x = rand.nextInt(5);
    secretWord = words[x];
    guessedLetters = new char[26];
    guesses = 0;
    badGuesses = 0;
    maxGuesses = secretWord.length() - 1;
    i = 0;
    setBlanks();
  }

  void setBlanks() {
    blanks = new char[secretWord.length()];
    for (int i = 0; i < blanks.length; i++) {
      blanks[i] = '_';
    }
  }

  void printBlanks() {
    for (int i = 0; i < blanks.length; i++) {
      System.out.print(" " + blanks[i]);
    }
    System.out.println();
  }
  
  // return true if the given letter is in secretWord
  boolean letterInSecretWord(char letter) {
    for (int i = 0; i < secretWord.length(); i++) {
      if (letter == secretWord.charAt(i)) {
        guesses++;
        return true;
      }
    }
    guesses++;
    return false;
  }

  void updateGuessedLetter(char c) {
    guessedLetters[i] = c;
    i++;
  }

  // return true if given letter is already in guessedLetters
  boolean letterAlreadyGuessed(char c) {
    int count = 0;
    for (int i = 0; i < guessedLetters.length; i++) {
      if (guessedLetters[i] == c) {
        count++;
        if(count > 1) {
          return true;
        }
      }
    }
    return false;
  }

  // return true if all the letters in the secretWord
  // are also in the array guessedLetters
  boolean gotAllLetters() {
    int j = 0;
    int words = secretWord.length();
    for (int i = 0; i < blanks.length; i++) {
      if (blanks[i] == secretWord.charAt(j)) {
        words--;
      }
      j++;
    }
    if (words == 0) {
      return true;
    }
    return false;
  }

  // print the secret word using blanks
  // door is printed as _ _ _ _
  // when 'o' has been guessed, it is printed as _ o o _
  void displaySecretWithBlanks() {
    printBlanks();
  }

  void updateDisplay(char letter) {
    for (int j = 0; j < secretWord.length(); j++) {
      if (letter == secretWord.charAt(j)) {
        blanks[j] = secretWord.charAt(j);
      }
    }
    displaySecretWithBlanks();
  }

  // prompt the user and return a single char
  // make sure the char is in the range a-z
  // prompt user multiple times if input is bad
  char promptAndGetLetter() {
    char letter;
    Scanner input = new Scanner(System.in);
    System.out.print("Guess a letter: ");
    letter = input.next().charAt(0);
    guesses++;
    while (!Character.isLetter(letter)) {
      System.out.println("Bad input!");
      System.out.print("Guess a letter: ");
      letter = input.next().charAt(0);
      updateGuessedLetter(letter);
    }
    updateGuessedLetter(letter);
    return letter;
  }

  // play the SecretWord game
  void play() {
    System.out.println("Welcome to SecretWord");
    char letter = ' ';
    // displaySecretWithBlanks(letter);
    updateDisplay(letter);
    while ((badGuesses < maxGuesses) && (!gotAllLetters())) {
      System.out.println(maxGuesses - badGuesses + " guesses left");
      letter = promptAndGetLetter();
      if (letterAlreadyGuessed(letter)) {
        System.out.println("Letter already guessed!");
      }
      if (letterInSecretWord(letter)) {
        System.out.println("Good guess, " + letter);
        guesses++;
        updateDisplay(letter);
      } else {
        System.out.println("Bad guess, " + letter);
        updateDisplay(letter);
        badGuesses++;
        guesses++;
      }
    }
    System.out.println("The answer was: " + secretWord);
    if (gotAllLetters()) {
      System.out.println("Congratulations!!!");
    } 
    if (badGuesses == maxGuesses) {
      System.out.println("You lost :-(");
    }
  }
}