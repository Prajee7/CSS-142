import java.util.*;

class TicTacToe {
  private String[] board;
  private boolean userX;

  TicTacToe() {
    board = new String[10];
    userX = true;
    for (int i = 1; i < 10; i++) {
      board[i] = " ";
    }
  }

  private boolean hasWon() {
    String player = "O";
    if (userX) {
      player = "X";
    }
    if (board[1].equals(player) && board[2].equals(player) && board[3].equals(player)) {
      return true;
    }
    if (board[4].equals(player) && board[5].equals(player) && board[6].equals(player)) {
      return true;
    }
    if (board[7].equals(player) && board[8].equals(player) && board[9].equals(player)) {
      return true;
    }
    if (board[1].equals(player) && board[5].equals(player) && board[9].equals(player)) {
      return true;
    }
    if (board[3].equals(player) && board[5].equals(player) && board[7].equals(player)) {
      return true;
    }
    return false;
  }

  private void show() {
    System.out.print(board[1]);
    System.out.print("|" + board[2] +"|");
    System.out.println(board[3]);
    System.out.print(board[4]);
    System.out.print("|" + board[5] +"|");
    System.out.println(board[6]);
    System.out.print(board[7]);
    System.out.print("|" + board[8] +"|");
    System.out.println(board[9]);
  }

  private boolean isEmpty(int loc) {
    return board[loc].equals(" ");
  }

  private void makeMark(int loc) {
    if (userX) {
      board[loc] = "X";
    } else {
      board[loc] = "O";
    }
  }

  public void play() {
    Scanner keyb = new Scanner(System.in);
    while (true) {
      show();
      System.out.print("Turn:");
      if (userX) {
        System.out.println("X");
      } else {
        System.out.println("O");
      }
      System.out.print("Enter number to place mark[1-9]>");
      int option = keyb.nextInt();
      if (isEmpty(option)) {
        makeMark(option);
        if (hasWon()) {
          break;
        }
        userX = !userX;
      }
    }
    show();
  }
}