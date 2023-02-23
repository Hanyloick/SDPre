import java.util.Scanner; 

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      /*
        Your solution goes here
      */

       userNum = scanner.nextInt();
       
       if (userNum > 0) {
          System.out.println(" The number is Positive ");
        } 

        else if (userNum < 0) {
          System.out.println(" The number is Negative ");
        }
        else if (userNum == 0) {
          System.out.println(" The number is 0 ");
        }


      scanner.close();
  }
}