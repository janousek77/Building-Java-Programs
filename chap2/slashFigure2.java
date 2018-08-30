// Exercise #17

public class slashFigure2{
  public static final int HEIGHT = 5;

  public static void main(String[] args) {
    for (int i = 0; i < HEIGHT; i++) {
      for (int j = i; j > 0; j--) {
        System.out.print("\\\\");
      }
      for (int j = 1; j < (HEIGHT*4+2 - ((i*4)+3)); j++) {
        System.out.print("!");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("//");
      }
      System.out.println();
    }
  }
}
