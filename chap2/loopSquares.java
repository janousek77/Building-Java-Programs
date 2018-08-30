// Exercise #2

class loopSquares{
  public static void main(String[] args) {
    int n = 1;
    for (int i = 3; n <= 100; i+=2) {
      System.out.print(n + " ");
      n+=i;
    }
  }
}
