// Exercise #5

class printGrid{
  public static void main(String[] args) {
    printGrid(3,6);
    System.out.println();
    printGrid(5,3);
    System.out.println();
    printGrid(4,1);
    System.out.println();
    printGrid(1,3);
    System.out.println();
  }

  public static void printGrid(int rows, int cols){
    for (int i = 1; i <= rows; i++) {
      System.out.print(i);
      int num = rows+i;
      for (int j = 0; j < cols-1; j++) {
        System.out.print(", "+num);
        num+=rows;
      }
      System.out.println();
    }
  }
}
