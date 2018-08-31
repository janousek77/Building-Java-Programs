// Exercise #22

public class DollarFigure{
  public static void main(String[] args) {
    for (int i = 0; i < 7; i++) {
      for (int j = 2*i; j > 0; j--) {
        System.out.print("*");
      }
      for (int j = 7-i; j > 0; j--) {
        System.out.print("$");
      }
      for (int j = (7-i)*2; j > 0; j--) {
        System.out.print("*");
      }
      for (int j = 7-i; j > 0; j--) {
        System.out.print("$");
      }
      for (int j = 2*i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
