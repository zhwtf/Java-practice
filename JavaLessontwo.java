import java.util.Scanner;

public class JavaLessontwo
{
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args){
    System.out.print("Your favorite number: ");

    if (userInput.hasNextInt()){
      //.hasNextDoublt, .hasNextFloat

        int numberEntered = userInput.nextInt();

        System.out.println("You entered " + numberEntered);

        int numEnteredTimes2 = numberEntered + numberEntered;
        System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

        int numberABS = Math.abs(numberEntered);
        int whichIsBigger = Math.max(5, 7);
        int whichIsSmaller = Math.max(5, 8);

        double numSqrt = Math.sqrt(5.23);

        int numCeiling = (int) Math.ceil(5.23); //6

        int randomNumber = (int) (Math.random() * 11); //random 0 to 10 inclusive
        System.out.println("randomNumber is " + randomNumber);
        


    }
    else{
      System.out.println("Enter an integer next time");

    }
  }
}
