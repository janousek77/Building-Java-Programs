// Exercise 18

class vertical{
  public static void main(String[] args) {
    vertical("hey now");
  }

  public static void vertical(String word) {
    for (int i = 0; i<word.length(); i++) {
      System.out.println(word.charAt(i));
    }
  }
}
