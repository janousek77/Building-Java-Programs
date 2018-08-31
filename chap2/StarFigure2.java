// Exercise #21

public class StarFigure2{
  public static final int ROWS = 5;
  public static void main(String[] args) {
    for (int i = ROWS; i > 0; i--) {
      for (int j = i; j > 1; j--) {
        System.out.print("////");
      }
      for (int j = i; j < ROWS; j++) {
        System.out.print("********");
      }
      for (int j = i; j > 1; j--) {
        System.out.print("\\\\\\\\");
      }
      System.out.println();
    }
  }
}
