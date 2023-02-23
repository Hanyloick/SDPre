import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    // jTODO prompt the user to get input for all of the String variables.
    System.out.println("What is your First Name?");
    fname = keyboard.nextLine();
    
    System.out.println("What is your Last Name?");
    lname = keyboard.nextLine();

    System.out.println("What is your favorite Animal?");
    favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favorite Food?");
    favoriteFood = keyboard.nextLine();

    System.out.println("What is your favorite Song?");
    favoriteSong = keyboard.nextLine();
  
    // TODO print the output formatted to look like the expected output using String concatenation.s
    System.out.println("My Name is " + fname + (" ") + lname);
    System.out.println("My Favorite Animal is " + favoriteAnimal);
    System.out.println("My Favorite Food is " + favoriteFood);
    System.out.println("My Favorite Song is " + favoriteSong);
    keyboard.close();


  }
}