// Exercise #3

class fibonacci{
  public static void main(String[] args) {
    int k1 = 0;
    int k2 = 1;
    for (int i = 1; i <= 12; i++) {
      System.out.print(k2 + " ");
      int next  = k1+k2;
      k1 = k2;
      k2 = next;
    }
  }
}
