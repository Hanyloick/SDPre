public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    /*
      Your solution goes here
    */

    while (counter < 20) { 
      counter = counter + 1;

    if (counter % 2 == 0) {
      System.out.println(counter + " is even");
    }
      else if (counter % 2 != 0) {
        System.out.println(counter + " is odd");
      }

    }
  }
}