// Exercise 17

class padString{
  public static void main(String[] args) {
    System.out.println(padString("hello", 8));
  }

  public static String padString(String word, int length) {
    for (int i = 0; i<length-word.length(); i++) {
      word=" "+word;
    }
    return word;
  }
}
