// Exercise #5

class starTriangle{
  public static void main(String[] args) {
    for (int i = 5; i > 0; i--) {
      for (int j = 6-i; j > 0; j--) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
