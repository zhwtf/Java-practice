import java.util.*;


public class jt5{

    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args){

        int Z = 3;
        divideByZero(Z);

        System.out.println("how old are you? ");
        int age = checkValidAge();

        if(age != 0){
            System.out.println("You are " + age + " years old!");
        }

    }

    public static void divideByZero(int a){

        try {

            System.out.println(a/0);
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static int checkValidAge(){
        try{
            return userInput.nextInt();
        }

        catch(InputMismatchException e){
            userInput.next();
            System.out.println("That's not valid input");
            return 0;
        }
    }
}
