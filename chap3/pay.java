// Exercise 13

class pay{
  public static void main(String[] args) {
    System.out.println(pay(5.50, 6));
    System.out.println(pay(4.00, 11));
  }

  public static double pay(double salary, int hours) {
    if(hours > 8)
      return (hours-8) * (salary*1.5) + (salary*8);
    else
      return salary * hours;
  }
}
