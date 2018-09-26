// Exercise 11

class distance{
  public static void main(String[] args) {
    System.out.println(distance(1,0,4,4));
    System.out.println(distance(10,2,3,15));
  }

  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
  }
}
