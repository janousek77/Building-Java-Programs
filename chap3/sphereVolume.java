// Exercise 15

class sphereVolume{
  public static void main(String[] args) {
    System.out.println(sphereVolume(2.0));
  }

  public static double sphereVolume(double radius) {
    return Math.PI*Math.pow(radius,3)*4/3;
  }
}
