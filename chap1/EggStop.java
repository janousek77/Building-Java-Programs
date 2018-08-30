// Exercise #15

class EggStop{
  public static void main(String[] args) {
    top();
    bottom();
    bottom();
    line();
    top();
    stop();
    bottom();
    top();
    line();
  }
  public static void top() {
    System.out.println("  _______");
    System.out.println(" /       \\");
    System.out.println("/         \\");
  }
  public static void stop() {
    System.out.println("|   Stop  |");
  }
  public static void line() {
    System.out.println("+---------+");
  }
  public static void bottom() {
    System.out.println("\\         /");
    System.out.println(" \\_______/");
  }

}
