// Exercise #1

class printNumbers{
  public static void main(String[] args) {
    printNumbers(5);
    System.out.println();
    printNumbers(15);
  }
  public static void printNumbers(int num){
    for (int i = 1; i <= num; i++) {
      System.out.print("["+i+"] ");
    }
  }
}
