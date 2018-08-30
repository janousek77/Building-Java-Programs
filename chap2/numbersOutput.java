public class numbersOutput {
  public static final int REPS = 6;
  public static final int RANGE = 10;

  public static void main(String[] args) {
    for (int i = 1; i <= REPS; i++) {
      for (int j = 1; j <= RANGE - 1; j++) {
        System.out.print(" ");
      }
        System.out.print("|");
    }
    System.out.println();
    for (int i = 1; i <= REPS; i++) {
      for (int j = 1; j <= RANGE; j++) {
        System.out.print(j % RANGE);
        }
      }
      System.out.println();
  }
}
