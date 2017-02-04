import java.util.Scanner;

public class jt4{
    static double myPI = 3.14159;

    public static void main(String[] args){

        addThen(1, 3);
        System.out.println("Global " + myPI);
    }

    public static int addThen(int a, int b){

        double smallPI = 3.140;

        double myPI = 3;
        System.out.println("local " + myPI);
        return 0;
    }
}
