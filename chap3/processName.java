// Exercise 21

import java.util.*;

class processName{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    processName(console);
  }

  public static void processName(Scanner console) {
    System.out.print("Please enter your full name: ");
    String name = console.nextLine();
    System.out.println("Your name in reverse order is" + name.substring(name.indexOf(" "), (name.length())) + ", " + name.substring(0, name.indexOf(" ")));
  }
}
