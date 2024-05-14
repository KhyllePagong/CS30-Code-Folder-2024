import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand =  new Random();
        int result;
        boolean loop = true;
        System.out.println("TYPE 1 TO ROLL: ");
        while (loop) {
            int input = keys.nextInt();
            if (input == 1){
                result = rand.nextInt(1000)+1;
                System.out.println("You rolled: " + result);
                if (result == 777){
                    System.out.println("JACKPOT!!!");
                    loop = false;
                }
                else if (result >= 100 && result < 500){
                    System.out.println("Welcome to the hundreds");
                }
                else if (result < 100){
                    System.out.println("Unlucky");
                }
                else if (result >= 500){
                    System.out.println("You're lucky");
                }
                else if (result == 1000){
                    System.out.println("LUCKY!!!");
                }
            }
            else {
                System.out.println("no roll? okay!");
                loop = false;
            }
        }
       
    }
}
