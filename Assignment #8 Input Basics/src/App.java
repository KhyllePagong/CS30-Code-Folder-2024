import static java.lang.System.*;

import java.util.Scanner;

public class App{

  public static void main (String[] args)

  {
      Scanner keyboard = new Scanner(System.in);
      //int
      int intOne, intTwo, a; 
      System.out.print("Enter an integer : ");
      intOne = keyboard.nextInt();
      System.out.print("Enter an integer : ");
      intTwo = keyboard.nextInt();
      //double
      double doubleOne, doubleTwo, b;
      System.out.print("Enter a double: ");
      doubleOne = keyboard.nextDouble();
      System.out.print("Enter a double: ");
      doubleTwo = keyboard.nextDouble();
      //print int
      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      //prnt double
      System.out.println("integer one = " + doubleOne);
      System.out.println("integer two = " + doubleTwo);
      //print sum
      a = intOne + intTwo;
      b = doubleOne + doubleTwo;
      System.out.println("intOne + intTwo = " + a);
      System.out.println("doubleOne + doubleTwo = " + b);
   }

}