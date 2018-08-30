// Exercise #16

public class slashFigure{
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = i; j > 0; j--) {
        System.out.print("\\\\");
      }
      for (int j = 1; j < (26 - ((i*4)+3)); j++) {
        System.out.print("!");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("//");
      }
      System.out.println();
    }
  }
}
