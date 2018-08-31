// Exercise #21

public class StarFigure2{
  public static final int ROWS = 3;
  public static void main(String[] args) {
    for (int i = ROWS; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("////");
      }
      for (int j = 1; j < (ROWS - (i*8-1)); j++) {
        System.out.print("*");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("\\\\\\\\");
      }
      System.out.println();
    }
  }
}
