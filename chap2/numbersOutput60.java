// Exercise #10

class numbersOutput60{
  public static void main(String[] args) {
    for (int j = 0; j < 6; j++) {
      for (int k = 0; k < 9; k++) {
        System.out.print(" ");
      }
      System.out.print("|");
    }
    System.out.println();
    for (int j = 0; j < 6; j++) {
      for (int k = 1; k < 11; k++) {
        if(k>9)
          System.out.print(0);
        else
          System.out.print(k);
      }
    }
  }
}
