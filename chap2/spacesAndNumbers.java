// Exercise #8

class spacesAndNumbers{
  public static void main(String[] args) {
    for (int i = 1; i < 6; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = i; k > 0; k--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
