// Exercise 12

class scientific{
  public static void main(String[] args) {
    System.out.println(scientific(1.9, -2));
    System.out.println(scientific(6.23, 5));
  }

  public static double scientific(double a, int b) {
    return a * Math.pow(10, b);
  }
}
