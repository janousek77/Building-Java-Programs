// Exercise #20

public class StarFigure{
  public static void main(String[] args) {
    for (int i = 4; i >= 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("////");
      }
      for (int j = 1; j < (32 - (i*8-1)); j++) {
        System.out.print("*");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("\\\\\\\\");
      }
      System.out.println();
    }
  }
}
