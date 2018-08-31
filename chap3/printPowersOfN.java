// Exercise #3

class printPowersOfN{
  public static void main(String[] args) {
    printPowersOfN(4,3);
    System.out.println();
    printPowersOfN(5,6);
    System.out.println();
    printPowersOfN(-2,8);
    System.out.println();
  }

  public static void printPowersOfN(int base, int exp){
    for (int i = 0; i <= exp; i++) {
      System.out.print((int) Math.pow(base, i)+ " ");
    }
  }
}
