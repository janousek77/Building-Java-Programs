// Exercise 22

import java.util.*;

// change class to public static class TheNameGame for practice it.
class TheNameGame{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    theNameGame(console);
  }

  public static void theNameGame(Scanner console) {
    System.out.print("What is your name? ");
    String name = console.nextLine();
    song(name.substring(0, name.indexOf(" ")));
    System.out.println(); // remove this for practice it
    song(name.substring(name.indexOf(" ")+1, (name.length())));
  }

  public static void song(String name) {
    String a = name.substring(1,name.length());
    System.out.println(name + " " + name + ", bo-B"+a);
    System.out.println("Banana-fana fo-F"+a);
    System.out.println("Fee-fi-mo-M"+a);
    System.out.println(name.toUpperCase()+"!");
  }
}
