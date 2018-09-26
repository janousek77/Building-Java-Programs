// Exercise 10

class area{
  public static void main(String[] args) {
    System.out.println(area(1));
    System.out.println(area(2));
    System.out.println(area(12.34));
    System.out.println(area(0));
  }

  public static double area(double num) {
    return Math.pow(num,2) * Math.PI;
  }
}
