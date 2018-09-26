// Exercise #7

class largestAbsVal{
  public static void main(String[] args) {
    System.out.println(largestAbsVal(3,6,-7));
    System.out.println(largestAbsVal(-5,3,6));
    System.out.println(largestAbsVal(4,1,2));
    System.out.println(largestAbsVal(1,-3,4));
  }

  public static int largestAbsVal(int a, int b, int c){
    int d = Math.max(Math.abs(a),Math.abs(b));
    return Math.max(Math.abs(c),d);
  }
}
