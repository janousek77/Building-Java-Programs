// Exercise #2

class printPowersOf2{
  public static void main(String[] args) {
    printPowersOf2(3);
    System.out.println();
    printPowersOf2(10);
    System.out.println();
  }

  public static void printPowersOf2(int num){
    for (int i = 0; i <= num; i++) {
      System.out.print((int) Math.pow(2,i)+ " ");
    }
  }
}
