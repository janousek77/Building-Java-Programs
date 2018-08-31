// Exercise #23

public class DollarFigure2{
  public static final int NUM = 3;
  public static void main(String[] args) {
    for (int i = 0; i < NUM; i++) {
      for (int j = 2*i; j > 0; j--) {
        System.out.print("*");
      }
      for (int j = NUM-i; j > 0; j--) {
        System.out.print("$");
      }
      for (int j = (NUM-i)*2; j > 0; j--) {
        System.out.print("*");
      }
      for (int j = NUM-i; j > 0; j--) {
        System.out.print("$");
      }
      for (int j = 2*i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
