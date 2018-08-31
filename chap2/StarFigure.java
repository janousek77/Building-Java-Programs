// Exercise #20

public class StarFigure{
  public static void main(String[] args) {
    for (int i = 5; i > 0; i--) {
      for (int j = i; j > 1; j--) {
        System.out.print("////");
      }
      for (int j = i; j < 5; j++) {
        System.out.print("********");
      }
      for (int j = i; j > 1; j--) {
        System.out.print("\\\\\\\\");
      }
      System.out.println();
    }
  }
}
