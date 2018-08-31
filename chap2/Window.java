// Exercise #19

class Window{
  public static final int NUM = 8;
  public static void main(String[] args) {
    line();
    pane();
    line();
    pane();
    line();
  }

  public static void line(){
    System.out.print("+");
    for (int i = 0; i<2; i++) {
      for (int j = 0; j < NUM; j++) {
        System.out.print("=");
      }
      System.out.print("+");
    }
    System.out.println();
  }

  public static void pane(){
    for (int i = 0; i < NUM; i++) {
      System.out.print("|");
      for (int j = 0; j< 2; j++) {
        for (int k = 0; k< NUM; k++) {
          System.out.print(" ");
        }
        System.out.print("|");
      }
      System.out.println();
    }
  }
}
