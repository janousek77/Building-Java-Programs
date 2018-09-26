// Exercise #6

class largerAbsVal{
  public static void main(String[] args) {
    System.out.println(largerAbsVal(3,6));
    System.out.println(largerAbsVal(-5,3));
    System.out.println(largerAbsVal(4,1));
    System.out.println(largerAbsVal(1,-3));
  }

  public static int largerAbsVal(int a, int b){
    return Math.max(Math.abs(a),Math.abs(b));
  }
}
