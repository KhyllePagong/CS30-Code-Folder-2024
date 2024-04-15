import java.lang.Math;
import java.util.Scanner;
public class Geometry {
    Scanner keyboard = new Scanner(System.in);
    double a,b,ans;
    public void rectangle(){
        System.out.println("Input your Length: ");
        a = keyboard.nextInt();
        System.out.println("Input your width: ");
        b = keyboard.nextInt();
        System.out.println("Using the formula 'P =2("+a+" + "+b+")'' ");
        ans = 2 * (a + b);
        System.out.println("The perimeter of the rectangle is "+ans);
    }

    public void cube(){
        System.out.println("Input your sides: ");
        a = keyboard.nextInt();
        System.out.println("Using the formula 'SA = 6("+a+")²'");
        ans = 6 * (a * a);
        System.out.println("The Surface Area of the cube is "+ans);
    }

    public void circle(){
        System.out.println("Input your radius: ");
        a = keyboard.nextInt();
        System.out.println("Using the formula 'A = π(" +a+")²' ");
        ans = Math.PI * (a*a);
        System.out.println("The Area of the Circle is "+ans);
    }
}
