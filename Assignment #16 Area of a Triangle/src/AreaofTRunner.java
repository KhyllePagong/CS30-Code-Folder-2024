import java.util.Scanner;
public class AreaofTRunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        AreaofT calculate = new AreaofT(0, 0, 0);
        System.out.print("Please input the sides of the triangle. \na=");
        int a = keyboard.nextInt();
        System.out.print("b=");
        int b = keyboard.nextInt();
        System.out.print("c=");
        int c = keyboard.nextInt();
        calculate.calcP(a,b,c);
    }
}
