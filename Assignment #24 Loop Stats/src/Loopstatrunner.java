import java.util.Scanner;
public class Loopstatrunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input start number:");
        int a = keyboard.nextInt();
        System.out.println("Input end number: ");
        int b = keyboard.nextInt();
        Loopstat test = new Loopstat(a,b);
        test.setNums(a, b);
        test.test();

        System.out.println("Input start number:");
        a = keyboard.nextInt();
        System.out.println("Input end number: ");
        b = keyboard.nextInt();
        test.setNums(a, b);
        test.test();
    }
}
