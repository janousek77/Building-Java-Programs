// Exercise 9

class lastDigit{
  public static void main(String[] args) {
    System.out.println(lastDigit(3572));
    System.out.println(lastDigit(738));
    System.out.println(lastDigit(-183));
    System.out.println(lastDigit(988765));
  }

  public static int lastDigit(int num) {
    return Math.abs(num % 10);
  }
}
